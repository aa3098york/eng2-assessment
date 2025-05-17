package uk.ac.york.eng2.orders.events;


import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class ProductEventConsumerTest {
    @Inject
    ProductEventConsumer consumer;

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
    void confirmOrderTest() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@gmail.com");

        customer = customerRepository.save(customer);

        Order order = new Order();
        order.setCustomer(customer);
        order.setAddress("123 Evergreen Terrace");

        order = orderRepository.save(order);

        OrderItem orderItem1 = new OrderItem();
        orderItem1.setProductId(1L);
        orderItem1.setQuantity(2);
        orderItem1.setOrder(order);

        orderItem1 = orderItemRepository.save(orderItem1);

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setProductId(2L);
        orderItem2.setQuantity(1);
        orderItem2.setOrder(order);

        orderItem2 = orderItemRepository.save(orderItem2);

        ProductInfo productInfo1 = new ProductInfo(1, new BigDecimal("12.00"));
        ProductInfo productInfo2 = new ProductInfo(2, new BigDecimal("76.00"));

        List<ProductInfo> productInfos = Arrays.asList(productInfo1, productInfo2);

        consumer.confirmOrder(order.getId(), new ProductInfoList(productInfos));

        Order updatedOrder = orderRepository.findById(order.getId()).orElse(null);

        OrderItem updatedOrderItem1 = orderItemRepository.findById(orderItem1.getId()).orElse(null);
        OrderItem updatedOrderItem2 = orderItemRepository.findById(orderItem2.getId()).orElse(null);


        assertEquals(new BigDecimal("100.00"), updatedOrder.getTotalAmount());
        assertEquals(new BigDecimal("12.00"), updatedOrderItem1.getUnitPrice());
        assertEquals(new BigDecimal("76.00"), updatedOrderItem2.getUnitPrice());

    }

    @Test
    void invalidProductTest(){
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setFamilyName("Smith");
        customer.setEmail("john.smith@gmail.com");

        customer = customerRepository.save(customer);

        Order order = new Order();
        order.setCustomer(customer);
        order.setAddress("123 Evergreen Terrace");

        order = orderRepository.save(order);

        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(1L);
        orderItem.setQuantity(2);
        orderItem.setOrder(order);

        orderItem = orderItemRepository.save(orderItem);

        assertEquals(1, orderItemRepository.findByOrderId(order.getId()).size());

        consumer.invalidProduct(order.getId(), orderItem.getProductId());

        assertEquals(0, orderItemRepository.findByOrderId(order.getId()).size());
    }
}
