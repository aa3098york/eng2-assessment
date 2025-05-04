package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class TagsControllerTest {

    @Inject
    TagsClient tagsClient;

    @Inject
    private ProductRepository productRepository;

    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @Inject
    TagRepository tagRepository;
    @Inject
    private TagsClient productTagsClient;

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
        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("test");
        long id = createTag(dto);

        Tag createdTag = productTagsClient.getTag(id);
        assertEquals("test", createdTag.getName());

        List<Tag> listedTags = tagsClient.listTags();
        assertEquals(1, listedTags.size());
        assertEquals(id, listedTags.get(0).getId());
    }

    @Test
    public void listTagProducts() {
        Tag tag = new Tag();
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
        Tag tag = new Tag();
        tag.setName("old");
        tag = tagRepository.save(tag);

        TagCreateDTO dto = new TagCreateDTO();
        dto.setName("new");
        tagsClient.updateTag(dto, tag.getId());
        Tag updatedTag = productTagsClient.getTag(tag.getId());
        assertEquals(dto.getName(), updatedTag.getName());
    }

    @Test
    public void deleteTag() {
        Tag tag = new Tag();
        tag.setName("test");
        tag = tagRepository.save(tag);

        tagsClient.deleteTag(tag.getId());
        assertEquals(0, tagsClient.listTags().size());
    }

    private Long createTag(TagCreateDTO dto) {
        HttpResponse<Void> createResponse = tagsClient.createTag(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
