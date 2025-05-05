package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class OrdersByDayControllerTest {

    @Inject
    OrdersByDayClient ordersByDayClient;

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
    public void listNoOrdersByDay() {
        assertEquals(0, ordersByDayClient.listOrdersByDay().size());
    }

    @Test
    public void createThenFetchOrdersByDay() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date = LocalDate.of(2020, 1, 1);

        Product product = new Product();
        product.setName("test");
        product.setUnitPrice(new BigDecimal("12.99"));
        product = productRepository.save(product);

        dto.setProductId(product.getId());
        dto.setDay(date);
        dto.setCount(3);

        Long id = createOrdersByDay(dto);
        OrdersByDay fetched = ordersByDayClient.getOrdersByDay(id);
        assertEquals(id, fetched.getId());
    }

    @Test
    public void createThenListOrdersByDay() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date = LocalDate.of(2020, 1, 1);

        Product product = new Product();
        product.setName("test");
        product.setUnitPrice(new BigDecimal("12.99"));
        product = productRepository.save(product);

        dto.setProductId(product.getId());
        dto.setDay(date);
        dto.setCount(3);

        ordersByDayClient.createOrdersByDay(dto);
        assertEquals(1, ordersByDayClient.listOrdersByDay().size());
    }

    @Test
    public void createThenFetchProduct() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();

        Product product = new Product();
        product.setName("test");
        product.setUnitPrice(new BigDecimal("12.99"));
        product = productRepository.save(product);

        LocalDate date = LocalDate.of(2020, 1, 1);

        dto.setProductId(product.getId());
        dto.setDay(date);
        dto.setCount(3);

        Long id = createOrdersByDay(dto);

        HttpResponse<Product> ordersByDayProductResponse = ordersByDayClient.getOrderByDayProduct(id);
        Product fetched = ordersByDayProductResponse.getBody().get();

        assertEquals(product.getId(), fetched.getId());
    }

    @Test
    public void updateOnlyCount() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        Product product1 = new Product();
        product1.setName("test 1");
        product1.setUnitPrice(new BigDecimal("12.99"));
        product1 = productRepository.save(product1);
        dto.setProductId(product1.getId());
        dto.setDay(date1);
        dto.setCount(3);

        Long id = createOrdersByDay(dto);

        dto.setCount(15);
        ordersByDayClient.updateOrdersByDay(id, dto);

        OrdersByDay updated = ordersByDayClient.getOrdersByDay(id);

        assertEquals(dto.getCount(), updated.getCount());
    }

    @Test
    public void updateOnlyDay() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date1 = LocalDate.of(2020, 2, 1);
        Product product = new Product();
        product.setName("test 1");
        product.setUnitPrice(new BigDecimal("12.99"));
        product = productRepository.save(product);
        dto.setProductId(product.getId());
        dto.setDay(date1);
        dto.setCount(3);

        Long id = createOrdersByDay(dto);

        dto.setDay(LocalDate.of(1997, 1, 31));
        ordersByDayClient.updateOrdersByDay(id, dto);

        OrdersByDay updated = ordersByDayClient.getOrdersByDay(id);

        assertEquals(dto.getDay(), updated.getDay());
    }

    @Test
    public void updateOnlyProduct() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date = LocalDate.of(2020, 2, 1);

        Product product1 = new Product();
        product1.setName("test 1");
        product1.setUnitPrice(new BigDecimal("12.99"));
        product1 = productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("test 2");
        product2.setUnitPrice(new BigDecimal("429.99"));
        product2 = productRepository.save(product2);

        dto.setProductId(product1.getId());
        dto.setDay(date);
        dto.setCount(3);

        Long id = createOrdersByDay(dto);

        dto.setProductId(product2.getId());
        ordersByDayClient.updateOrdersByDay(id, dto);

        HttpResponse<Product> ordersByDayProductResponse = ordersByDayClient.getOrderByDayProduct(id);
        Product fetched = ordersByDayProductResponse.getBody().get();

        assertEquals(dto.getProductId(), fetched.getId());
    }

    @Test
    public void updateWithMissingProduct() {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date = LocalDate.of(2020, 1, 1);
        Product product1 = new Product();
        product1.setName("test 1");
        product1.setUnitPrice(new BigDecimal("12.99"));
        product1 = productRepository.save(product1);
        dto.setProductId(product1.getId());
        dto.setDay(date);
        dto.setCount(3);
        Long id = createOrdersByDay(dto);

        dto.setProductId(123L);

        HttpResponse response = ordersByDayClient.updateOrdersByDay(id, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void createThenDelete()
    {
        OrdersByDayCreateDTO dto = new OrdersByDayCreateDTO();
        LocalDate date = LocalDate.of(2020, 1, 1);
        Product product = new Product();
        product.setName("test");
        product.setUnitPrice(new BigDecimal("12.99"));
        product = productRepository.save(product);
        dto.setProductId(product.getId());
        dto.setDay(date);
        dto.setCount(3);
        Long id = createOrdersByDay(dto);
        ordersByDayClient.deleteOrdersByDay(id);

        assertEquals(0, ordersByDayClient.listOrdersByDay().size());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = ordersByDayClient.deleteOrdersByDay(13);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    private Long createOrdersByDay(OrdersByDayCreateDTO dto) {
        HttpResponse<Void> createResponse = ordersByDayClient.createOrdersByDay(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
