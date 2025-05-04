package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayCreateDTO;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;

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
    ProductTagRepository tagRepository;

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
        product.setUnit_price(2f);
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
        product.setUnit_price(2f);
        product = productRepository.save(product);

        dto.setProductId(product.getId());
        dto.setDay(date);
        dto.setCount(3);

        ordersByDayClient.createOrdersByDay(dto);
        assertEquals(1, ordersByDayClient.listOrdersByDay().size());
    }

    private Long createOrdersByDay(OrdersByDayCreateDTO dto) {
        HttpResponse<Void> createResponse = ordersByDayClient.createOrdersByDay(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
