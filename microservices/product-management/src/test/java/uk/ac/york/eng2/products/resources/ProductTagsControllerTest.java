package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.dto.ProductTagCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class ProductTagsControllerTest {

    @Inject ProductTagsClient tagsClient;

    @Inject
    private ProductRepository productRepository;

    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @Inject
    ProductTagRepository tagRepository;
    @Inject
    private ProductTagsClient productTagsClient;

    @BeforeEach
    public void setup() {
        tagRepository.deleteAll();
        productRepository.deleteAll();
    }

    @Test
    public void noTags() {
        assertEquals(0, tagsClient.listTags().size());
    }

    @Test
    public void createThenFetchTags() {
        ProductTagCreateDTO dto = new ProductTagCreateDTO();
        dto.setName("test");
        HttpResponse<Void> response = tagsClient.createTag(dto);
        long id = Long.parseLong(response.header(HttpHeaders.LOCATION).split("/")[2]);

        var createdTag = productTagsClient.getTag(id);
        assertEquals("test", createdTag.getName());

        var listedTags = tagsClient.listTags();
        assertEquals(1, listedTags.size());
        assertEquals(id, listedTags.get(0).getId());
    }

    @Test
    public void listTagProducts() {
        ProductTag tag = new ProductTag();
        tag.setName("test");
        tag = tagRepository.save(tag);

        assertEquals(0, tagsClient.listProducts(tag.getId()).size());

        Product product = new Product();
        product.setName("Test Product");
        product.getTags().add(tag);
        productRepository.save(product);

        List<Product> products = tagsClient.listProducts(tag.getId());
        assertEquals(1, products.size());
        assertEquals(product.getId(), products.get(0).getId());
    }

    @Test
    public void updateTag() {
        ProductTag tag = new ProductTag();
        tag.setName("old");
        tag = tagRepository.save(tag);

        ProductTagCreateDTO dto = new ProductTagCreateDTO();
        dto.setName("new");
        tagsClient.updateTag(dto, tag.getId());
        var updatedTag = productTagsClient.getTag(tag.getId());
        assertEquals(dto.getName(), updatedTag.getName());
    }

    @Test
    public void deleteTag() {
        ProductTag tag = new ProductTag();
        tag.setName("test");
        tag = tagRepository.save(tag);

        tagsClient.deleteTag(tag.getId());
        assertEquals(0, tagsClient.listTags().size());
    }
}
