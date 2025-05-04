package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;

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
    ProductTagRepository tagRepository;

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
        Product updatedProduct = productsClient.getProduct(productId);
        assertEquals(p.getName(), updatedProduct.getName());
    }

    @Test
    public void updateOnlyUnitPrice() {
        ProductCreateDTO p = new ProductCreateDTO();
        p.setName("test");
        p.setUnit_price(10);
        Long productId = createProduct(p);

        p.setUnit_price(20);
        Product updatedProduct = productsClient.getProduct(productId);
        assertEquals(p.getUnit_price(), updatedProduct.getUnit_price());

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

    private Long createProduct(ProductCreateDTO dto) {
        HttpResponse<Void> createResponse = productsClient.createProduct(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
