package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.Sql;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@MicronautTest(transactional = false)
public class ProductsControllerTest {

    @Inject
    private ProductsClient productsClient;

    @Inject
    private ProductRepository productRepository;

    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @Inject
    TagRepository tagRepository;

    @BeforeEach
    public void setup() {
        ordersByDayRepository.deleteAll();
        tagRepository.deleteAll();
        productRepository.deleteAll();
    }

    @Test
    public void noProducts() {
        assertEquals(0, productsClient.getProducts().size());
    }

    @Test
    void createThenList() {
        ProductCreateDTO productDTO = new ProductCreateDTO();
        productDTO.setName("test");

        productsClient.createProduct(productDTO);
        assertEquals(1, productsClient.getProducts().size());
    }

    @Test
    void createThenFetch() {
        ProductCreateDTO productDTO = new ProductCreateDTO();
        productDTO.setName("test");

        Long productId = createProduct(productDTO);
        Product fetchedProduct = productsClient.getProduct(productId);
        assertEquals(productId, fetchedProduct.getId());
    }

    @Test
    public void fetchMissingProduct() {
        assertNull(productsClient.getProduct(123));
    }

    @Test
    public void updateOnlyName() {
        ProductCreateDTO p = new ProductCreateDTO();
        p.setName("test");
        Long productId = createProduct(p);

        p.setName("test2");
        productsClient.updateProduct(productId, p);
        Product updatedProduct = productsClient.getProduct(productId);
        assertEquals(p.getName(), updatedProduct.getName());
    }

    @Test
    public void updateOnlyUnitPrice() {
        ProductCreateDTO p = new ProductCreateDTO();
        p.setName("test");
        p.setUnitPrice(new BigDecimal("10.00"));
        Long productId = createProduct(p);

        p.setUnitPrice(new BigDecimal("20.00"));
        productsClient.updateProduct(productId, p);
        Product updatedProduct = productsClient.getProduct(productId);
        assertEquals(p.getUnitPrice(), updatedProduct.getUnitPrice());

    }

    @Test
    public void createThenDelete() {
        ProductCreateDTO p = new ProductCreateDTO();
        p.setName("test");
        Long productId = createProduct(p);
        productsClient.deleteProduct(productId);
        assertEquals(0, productsClient.getProducts().size());
    }

    @Test
    public void createAndGetTags(){
        ProductCreateDTO p = new ProductCreateDTO();
        p.setName("test");
        p.setUnitPrice(new BigDecimal("10.00"));
        Long productId = createProduct(p);
    }

    @Test
    public void updateMissing() {
        ProductCreateDTO update = new ProductCreateDTO();
        update.setName("test");

        HttpResponse response = productsClient.updateProduct(23, update);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = productsClient.deleteProduct(23);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void listOrdersByDay() {
        Product p = new Product();
        p.setName("Test Product");
        p = productRepository.save(p);

        OrdersByDay o1 = new OrdersByDay();
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        o1.setDay(date1);
        o1.setCount(1);
        o1.setProduct(p);
        ordersByDayRepository.save(o1);

        OrdersByDay o2 = new OrdersByDay();
        LocalDate date2 = LocalDate.of(2021, 2, 2);
        o2.setDay(date2);
        o2.setCount(2);
        o2.setProduct(p);
        ordersByDayRepository.save(o2);

        List<OrdersByDay> productOrdersByDay = productsClient.listOrdersByDay(p.getId());
        assertEquals(2, productOrdersByDay.size());
    }

    @Test
    public void listTags() {
        ProductCreateDTO p = new ProductCreateDTO();
        p.setName("Test Product");
        p.setUnitPrice(new BigDecimal("10.00"));
        Long productId = createProduct(p);

        assertEquals(0, productsClient.getProductTags(productId).size());

        Tag tag = new Tag();
        tag.setName("Test Tag");
        tag = tagRepository.save(tag);

        productsClient.addProductTag(productId, tag.getId());
        List<Tag> productTags = productsClient.getProductTags(productId);
        assertEquals(1, productTags.size());
        assertEquals(tag.getId(), productTags.get(0).getId());

        productsClient.removeProductTag(productId, tag.getId());
        assertEquals(0, productsClient.getProductTags(productId).size());

    }

    private Long createProduct(ProductCreateDTO dto) {
        HttpResponse<Void> createResponse = productsClient.createProduct(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
