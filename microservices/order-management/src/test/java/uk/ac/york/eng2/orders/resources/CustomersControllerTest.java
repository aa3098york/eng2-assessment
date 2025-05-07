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
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@MicronautTest(transactional = false)
public class CustomersControllerTest {
    @Inject
    CustomersClient customersClient;
    
    @Inject
    CustomerRepository customerRepository;
    
    @Inject
    OrderRepository orderRepository;
    
    @BeforeEach
    public void setup() {
        customerRepository.deleteAll();
        orderRepository.deleteAll();
    }
    
    @Test
    public void noCustomers() {
        assertEquals(0, customersClient.getCustomers().size());
    }

    @Test
    public void createThenFetch() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Smith");
        dto.setEmail("john.smith@gmail.com");

        Long id = createCustomer(dto);

        Customer fetched = customersClient.getCustomer(id);
        assertEquals(dto.getFirstName(), fetched.getFirstName());
        assertEquals(dto.getFamilyName(), fetched.getFamilyName());
        assertEquals(dto.getEmail(), fetched.getEmail());
    }

    @Test
    public void updateOnlyFirstName() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Smith");
        dto.setEmail("john.smith@gmail.com");

        Long id = createCustomer(dto);

        dto.setFirstName("Jane");
        customersClient.updateCustomer(id, dto);
        Customer updated = customersClient.getCustomer(id);
        assertEquals(dto.getFirstName(), updated.getFirstName());
    }

    @Test
    public void updateOnlyFamilyName() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Smith");
        dto.setEmail("john.smith@gmail.com");

        Long id = createCustomer(dto);

        dto.setFamilyName("Doe");
        customersClient.updateCustomer(id, dto);
        Customer updated = customersClient.getCustomer(id);
        assertEquals(dto.getFamilyName(), updated.getFamilyName());
    }

    @Test
    public void updateOnlyEmail() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Smith");
        dto.setEmail("john.smith@gmail.com");

        Long id = createCustomer(dto);

        dto.setEmail("jane.doe@gmail.com");
        customersClient.updateCustomer(id, dto);
        Customer updated = customersClient.getCustomer(id);
        assertEquals(dto.getEmail(), updated.getEmail());
    }

    @Test
    public void updateMissing() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Smith");
        dto.setEmail("john.smith@gmail.com");
        HttpResponse response = customersClient.updateCustomer(1234, dto);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void createThenDelete() {
        CustomerCreateDTO dto = new CustomerCreateDTO();
        dto.setFirstName("John");
        dto.setFamilyName("Smith");
        dto.setEmail("john.smith@gmail.com");

        Long id = createCustomer(dto);

        customersClient.deleteCustomer(id);
        assertEquals(0, customersClient.getCustomers().size());
    }

    @Test
    public void deleteMissing() {
        HttpResponse response = customersClient.deleteCustomer(123);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatus());
    }

    @Test
    public void deleteWithActiveOrder() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@gmail.com");

        customer = customerRepository.save(customer);

        Order order = new Order();
        order.setDelivered(true);
        order.setDateCreated(LocalDate.of(2020, 1, 1));
        order.setPaid(true);
        order.setTotalAmount(new BigDecimal("10.00"));
        order.setAddress("Dummy Address");
        order.setCustomer(customer);

        orderRepository.save(order);

        try {
            customersClient.deleteCustomer(customer.getId());
            fail("Expected HttpClientResponseException but none was thrown.");
        } catch (HttpClientResponseException e) {
            assertEquals(HttpStatus.CONFLICT, e.getResponse().getStatus());
        }
    }

    @Test
    public void ListOrders() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@gmail.com");
        customer = customerRepository.save(customer);

        Order order1 = new Order();
        order1.setDelivered(true);
        order1.setDateCreated(LocalDate.of(2020, 1, 1));
        order1.setPaid(true);
        order1.setTotalAmount(new BigDecimal("10.00"));
        order1.setAddress("Dummy Address");
        order1.setCustomer(customer);
        orderRepository.save(order1);

        Order order2 = new Order();
        order2.setDelivered(false);
        order2.setDateCreated(LocalDate.of(2020, 6, 2));
        order2.setPaid(true);
        order2.setTotalAmount(new BigDecimal("10.00"));
        order2.setAddress("Dummy Address");
        order2.setCustomer(customer);
        orderRepository.save(order2);

        List<Order> orders = customersClient.getOrders(customer.getId());
        assertEquals(2, orders.size());

    }

    private Long createCustomer(CustomerCreateDTO dto) {
        HttpResponse<Void> createResponse = customersClient.createCustomer(dto);
        return Long.valueOf(createResponse.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
