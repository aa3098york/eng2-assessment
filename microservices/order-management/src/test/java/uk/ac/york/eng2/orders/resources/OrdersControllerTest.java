package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@MicronautTest(transactional = false)
public class OrdersControllerTest {
    @Inject
    OrdersClient ordersClient;

    @Inject
    OrderRepository orderRepository;

    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        orderItemRepository.deleteAll();
        orderRepository.deleteAll();
        customerRepository.deleteAll();
    }

    @Test
    public void noOrders() {
        assertEquals(0, ordersClient.getOrders().size());
    }

    @Test
    public void createThenFetch() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderCreateDTO dto = new OrderCreateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());

        Long id = createOrder(dto);

        Order fetchedOrder = ordersClient.getOrder(id);

        HttpResponse<Customer> orderCustomerResponse = ordersClient.getOrderCustomer(id);
        Customer fetchedCustomer = orderCustomerResponse.getBody().get();

        assertEquals(dto.getAddress(), fetchedOrder.getAddress());
        assertEquals(dto.getCustomerId(), fetchedCustomer.getId());
    }

    @Test
    public void createWithMissingCustomer() {
        OrderCreateDTO dto = new OrderCreateDTO();
        dto.setAddress("Dummy Address");


        try {
            ordersClient.createOrder(dto); // This will throw an exception
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getResponse().getStatus());
        }
    }

    @Test
    public void updateOnlyAddress() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderUpdateDTO dto = new OrderUpdateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());
        dto.setDelivered(true);
        dto.setPaid(true);

        Long id = createOrder(dto);

        dto.setAddress("Real Address");

        ordersClient.updateOrder(id, dto);
        Order updatedOrder = ordersClient.getOrder(id);

        assertEquals(dto.getAddress(), updatedOrder.getAddress());
    }


    @Test
    public void updateOnlyCustomer() {
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setFamilyName("Smith");
        customer1.setEmail("john.smith@example.com");
        customer1 = customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Jane");
        customer2.setFamilyName("Doe");
        customer2.setEmail("jane.doe@example.com");
        customer2 = customerRepository.save(customer2);

        OrderUpdateDTO dto = new OrderUpdateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer1.getId());
        dto.setPaid(true);
        dto.setDelivered(true);

        Long id = createOrder(dto);

        dto.setCustomerId(customer2.getId());

        ordersClient.updateOrder(id, dto);
        Order updatedOrder = ordersClient.getOrder(id);

        HttpResponse<Customer> orderCustomerResponse = ordersClient.getOrderCustomer(id);
        Customer fetchedCustomer = orderCustomerResponse.getBody().get();

        assertEquals(dto.getCustomerId(), fetchedCustomer.getId());
    }

    @Test
    public void updateOnlyPaid(){
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderUpdateDTO dto = new OrderUpdateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());
        dto.setPaid(false);
        dto.setDelivered(false);

        Long id = createOrder(dto);

        dto.setPaid(true);

        ordersClient.updateOrder(id, dto);
        Order updatedOrder = ordersClient.getOrder(id);

        assertEquals(true, updatedOrder.getPaid());
    }

    @Test
    public void updateOnlyDelivered(){
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderUpdateDTO dto = new OrderUpdateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());
        dto.setDelivered(false);
        dto.setPaid(false);

        Long id = createOrder(dto);

        dto.setDelivered(true);

        ordersClient.updateOrder(id, dto);
        Order updatedOrder = ordersClient.getOrder(id);

        assertEquals(true, updatedOrder.getDelivered());
    }

    @Test
    public void updateMissing() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderUpdateDTO dto = new OrderUpdateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());
        dto.setDelivered(false);
        dto.setPaid(true);

        HttpResponse response = ordersClient.updateOrder(123,dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void updateMissingCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderUpdateDTO dto = new OrderUpdateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());
        dto.setDelivered(false);
        dto.setPaid(true);

        Long id = createOrder(dto);
        dto.setCustomerId(123L);
        dto.setAddress("123 Example Address");

        HttpResponse response = ordersClient.updateOrder(id,dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = ordersClient.deleteOrder(123);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteWithOrderItems() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        Order order = new Order();
        order.setDelivered(false);
        order.setDateCreated(LocalDate.of(2025,12,31));
        order.setAddress("Dummy Address");
        order.setPaid(false);
        order.setTotalAmount(new BigDecimal("9.99"));
        order.setCustomer(customer);
        order = orderRepository.save(order);


        OrderItem item1 = new OrderItem();
        item1.setQuantity(1);
        item1.setProductId(1L);
        item1.setUnitPrice(new BigDecimal(1));
        item1.setOrder(order);
        orderItemRepository.save(item1);

        OrderItem item2 = new OrderItem();
        item2.setQuantity(2);
        item2.setProductId(2L);
        item2.setUnitPrice(new BigDecimal(2));
        item2.setOrder(order);
        orderItemRepository.save(item2);

        ordersClient.deleteOrder(order.getId());

        List<OrderItem> orderItems = ordersClient.getOrderItems(order.getId());
        assertEquals(0, orderItems.size());
    }


    @Test
    public void createThenDelete() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        OrderCreateDTO dto = new OrderCreateDTO();
        dto.setAddress("Dummy Address");
        dto.setCustomerId(customer.getId());

        Long id = createOrder(dto);

        ordersClient.deleteOrder(id);

        assertEquals(0, ordersClient.getOrders().size());
    }

    @Test
    public void listOrderItems() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@example.com");
        customer = customerRepository.save(customer);

        Order order = new Order();
        order.setDelivered(false);
        order.setDateCreated(LocalDate.of(2025,12,31));
        order.setAddress("Dummy Address");
        order.setPaid(false);
        order.setTotalAmount(new BigDecimal("9.99"));
        order.setCustomer(customer);
        order = orderRepository.save(order);


        OrderItem item1 = new OrderItem();
        item1.setQuantity(1);
        item1.setProductId(1L);
        item1.setUnitPrice(new BigDecimal(1));
        item1.setOrder(order);
        orderItemRepository.save(item1);

        OrderItem item2 = new OrderItem();
        item2.setQuantity(2);
        item2.setProductId(2L);
        item2.setUnitPrice(new BigDecimal(2));
        item2.setOrder(order);
        orderItemRepository.save(item2);

        List<OrderItem> orderItems = ordersClient.getOrderItems(order.getId());
        assertEquals(2, orderItems.size());
    }



    private Long createOrder(OrderCreateDTO dto) {
        HttpResponse<Void> createResponse = ordersClient.createOrder(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
