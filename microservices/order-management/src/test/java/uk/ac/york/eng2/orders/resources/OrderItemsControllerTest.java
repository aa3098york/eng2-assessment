package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@MicronautTest(transactional = false)
public class OrderItemsControllerTest {
    @Inject
    OrderItemsClient orderItemsClient;

    @Inject
    OrderItemRepository repository;

    @Inject
    OrderRepository orderRepository;

    @Inject
    CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        repository.deleteAll();
        orderRepository.deleteAll();
        customerRepository.deleteAll();
    }

    @Test
    public void noOrderItems() {
        assertEquals(0, orderItemsClient.getOrderItems().size());
    }

    @Test
    public void createThenFetch() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        Long id = createOrderItem(dto);

        OrderItem fetchedOrderItem = orderItemsClient.getOrderItem(id);

        HttpResponse<Order> itemOrderResponse = orderItemsClient.getOrder(id);
        Order fetchedOrder = itemOrderResponse.getBody().get();

        assertEquals(dto.getOrderId(), fetchedOrder.getId());
        assertEquals(dto.getQuantity(), fetchedOrderItem.getQuantity());
        assertEquals(dto.getUnitPrice(), fetchedOrderItem.getUnitPrice());
        assertEquals(dto.getProductId(), fetchedOrderItem.getProductId());
    }

    @Test
    public void createWithMissingQuantity() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(null);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        try {
            orderItemsClient.createOrderItem(dto); // This will throw an exception
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getResponse().getStatus());
        }
    }

    @Test
    public void createWithMissingProductId() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(BigDecimal.ZERO);
        dto.setQuantity(1);
        dto.setProductId(null);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        try {
            orderItemsClient.createOrderItem(dto); // This will throw an exception
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getResponse().getStatus());
        }
    }

    @Test
    public void createWithMissingOrder() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        try {
            orderItemsClient.createOrderItem(dto); // This will throw an exception
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getResponse().getStatus());
        }
    }

    @Test
    public void updateOnlyUnitPrice() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        Long id = createOrderItem(dto);

        dto.setUnitPrice(new BigDecimal("22.00"));
        orderItemsClient.updateOrderItem(id, dto);

        OrderItem updatedOrderItem = orderItemsClient.getOrderItem(id);
        assertEquals(dto.getUnitPrice(), updatedOrderItem.getUnitPrice());
    }

    @Test
    public void updateOnlyQuantity() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        Long id = createOrderItem(dto);

        dto.setQuantity(22);
        orderItemsClient.updateOrderItem(id, dto);

        OrderItem updatedOrderItem = orderItemsClient.getOrderItem(id);
        assertEquals(dto.getQuantity(), updatedOrderItem.getQuantity());
    }

    @Test
    public void updateOnlyProductId() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);
        dto.setOrderId(order.getId());

        Long id = createOrderItem(dto);

        dto.setProductId(22L);

        orderItemsClient.updateOrderItem(id, dto);

        OrderItem updatedOrderItem = orderItemsClient.getOrderItem(id);
        assertEquals(dto.getProductId(), updatedOrderItem.getProductId());
    }

    @Test
    public void updateOnlyOrder() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order1 = new Order();
        order1.setAddress("Dummy Address");
        order1.setDateCreated(LocalDate.of(2020, 1, 1));
        order1.setTotalAmount(new BigDecimal("12.00"));
        order1.setDelivered(true);
        order1.setPaid(true);
        order1.setCustomer(customer);
        order1 = orderRepository.save(order1);

        dto.setOrderId(order1.getId());

        Long id = createOrderItem(dto);

        Order order2 = new Order();
        order2.setAddress("Real Address");
        order2.setDateCreated(LocalDate.of(1997, 1, 31));
        order2.setTotalAmount(new BigDecimal("22.00"));
        order2.setDelivered(false);
        order2.setPaid(false);
        order2.setCustomer(customer);
        order2 = orderRepository.save(order2);

        dto.setOrderId(order2.getId());

        orderItemsClient.updateOrderItem(id, dto);

        HttpResponse<Order> itemOrderResponse = orderItemsClient.getOrder(id);
        Order fetchedOrder = itemOrderResponse.getBody().get();

        OrderItem updatedOrderItem = orderItemsClient.getOrderItem(id);
        assertEquals(dto.getOrderId(), fetchedOrder.getId());
    }

    @Test
    public void updateMissing() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        HttpResponse response = orderItemsClient.updateOrderItem(123, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test void updateWithMissingFields() {
        //Setup
        OrderItemCreateDTO dto = new OrderItemCreateDTO();


        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        dto.setUnitPrice(BigDecimal.ZERO);
        dto.setQuantity(1);
        dto.setProductId(null);

        try {
            orderItemsClient.createOrderItem(dto); // This will throw an exception
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getResponse().getStatus());
        }

        dto.setUnitPrice(BigDecimal.ZERO);
        dto.setQuantity(null);
        dto.setProductId(1L);

        try {
            orderItemsClient.createOrderItem(dto); // This will throw an exception
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getResponse().getStatus());
        }
    }

    @Test
    public void createThenDelete() {
        OrderItemCreateDTO dto = new OrderItemCreateDTO();
        dto.setUnitPrice(new BigDecimal("12.00"));
        dto.setQuantity(1);
        dto.setProductId(1L);

        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);


        Order order = new Order();
        order.setAddress("Dummy Address");
        order.setDateCreated(LocalDate.of(1997, 1, 31));
        order.setTotalAmount(new BigDecimal("12.00"));
        order.setDelivered(true);
        order.setPaid(true);
        order.setCustomer(customer);
        order = orderRepository.save(order);

        dto.setOrderId(order.getId());

        Long id = createOrderItem(dto);

        orderItemsClient.deleteOrderItem(id);
        assertEquals(0, orderItemsClient.getOrderItems().size());
    }

    @Test
    public void deleteMissing(){
        HttpResponse response = orderItemsClient.deleteOrderItem(123);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    private Long createOrderItem(OrderItemCreateDTO dto) {
        HttpResponse<Void> createResponse = orderItemsClient.createOrderItem(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
