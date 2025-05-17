package uk.ac.york.eng2.integration;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.api.CustomersApi;
import uk.ac.york.eng2.orders.api.OrderItemsApi;
import uk.ac.york.eng2.orders.api.OrdersApi;
import uk.ac.york.eng2.orders.model.*;
import uk.ac.york.eng2.products.api.OrdersByDayApi;
import uk.ac.york.eng2.products.api.ProductsApi;
import uk.ac.york.eng2.products.api.TagsApi;
import uk.ac.york.eng2.products.model.OrdersByDay;
import uk.ac.york.eng2.products.model.OrdersByDayCreateDTO;
import uk.ac.york.eng2.products.model.ProductCreateDTO;
import uk.ac.york.eng2.products.model.TagCreateDTO;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Callable;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@MicronautTest
public class OrderWorkflowTest {

    @Inject private OrdersApi ordersApi;
    @Inject private CustomersApi customersApi;
    @Inject private OrderItemsApi orderItemsApi;
    @Inject private ProductsApi productsApi;
    @Inject private OrdersByDayApi ordersByDayApi;
    @Inject private TagsApi tagsApi;

    @Test
    public void createOrder() {

        // Create Product and Tags

        ProductCreateDTO productDTO = new ProductCreateDTO();
        productDTO.setName("Bakewell Tarts");
        productDTO.setUnitPrice(new BigDecimal("12.00"));

        HttpResponse<Void> productCreatedResponse = productsApi.createProduct(productDTO);
        assertEquals(HttpStatus.CREATED, productCreatedResponse.status());
        long productId = Long.parseLong(productCreatedResponse.header(HttpHeaders.LOCATION).split("/")[2]);


        TagCreateDTO tagDTO = new TagCreateDTO();
        tagDTO.setName("cake");

        HttpResponse<Void> tagCreatedResponse = tagsApi.createTag(tagDTO);
        assertEquals(HttpStatus.CREATED, tagCreatedResponse.status());
        long tagId = Long.parseLong(tagCreatedResponse.header(HttpHeaders.LOCATION).split("/")[2]);

        // Associate product with the tag
        HttpResponse<Void> addProductTagResponse = productsApi.addProductTag(productId, tagId);
        assertEquals(HttpStatus.OK, addProductTagResponse.status());






        CustomerCreateDTO customerDTO = new CustomerCreateDTO();
        customerDTO.setFirstName("John");
        customerDTO.setFamilyName("Smith");
        customerDTO.setEmail("john.smith@example.com");

        HttpResponse<Void> customerCreatedResponse = customersApi.createCustomer(customerDTO);
        assertEquals(HttpStatus.CREATED, customerCreatedResponse.getStatus());
        long customerId = Long.parseLong(customerCreatedResponse.header(HttpHeaders.LOCATION).split("/")[2]);



        OrderCreateDTO orderDTO = new OrderCreateDTO();
        orderDTO.setAddress("123 Evergreen Terrace");
        orderDTO.setCustomerId(customerId);

        HttpResponse<Void> orderCreatedResponse = ordersApi.createOrder(orderDTO);
        assertEquals(HttpStatus.CREATED, orderCreatedResponse.getStatus());
        long orderId = Long.parseLong(orderCreatedResponse.header(HttpHeaders.LOCATION).split("/")[2]);


        OrderItemCreateDTO orderItemDTO = new OrderItemCreateDTO();
        orderItemDTO.setOrderId(orderId);
        orderItemDTO.setQuantity(2);
        orderItemDTO.setProductId(productId);

        HttpResponse<Void> orderItemCreatedResponse = orderItemsApi.createOrderItem(orderItemDTO);
        assertEquals(HttpStatus.CREATED, orderItemCreatedResponse.getStatus());
        long orderItemId = Long.parseLong(orderItemCreatedResponse.header(HttpHeaders.LOCATION).split("/")[2]);

        // Get Order object to get its created date
        HttpResponse<@Valid Order> orderResponse = ordersApi.getOrder1(orderId);
        assertTrue(orderResponse.getBody().isPresent());

        LocalDate date = orderResponse.getBody().get().getDateCreated();

        System.out.println(date);


//        // Create OrdersDayEntry to get Id so we can check if it updates
//        OrdersByDayCreateDTO byDayDTO = new OrdersByDayCreateDTO();
//        byDayDTO.setDay(date);
//        byDayDTO.setProductId(productId);
//        byDayDTO.setCount(0);
//
//        HttpResponse<Void> ordersByDayCreatedResponse = ordersByDayApi.createOrdersByDay(byDayDTO);
//        assertEquals(HttpStatus.CREATED, ordersByDayCreatedResponse.getStatus());
//        long ordersByDayId = Long.parseLong(ordersByDayCreatedResponse.header(HttpHeaders.LOCATION).split("/")[2]);


        await().atMost(Duration.ofSeconds(10))
                .alias("Waiting for unit price to become 12.00")
                .until(unitPriceBecomes(orderItemId, new BigDecimal("12.00")));
        await().atMost(Duration.ofSeconds(15))
                .alias("Waiting for total price to become 24.00")
                .until(totalAmountBecomes(orderId, new BigDecimal("24.00")));
        await().atMost(Duration.ofSeconds(20))
                .alias("Waiting for OrdersByDay to become 1")
                .until(ordersByDayBecomes(productId, date, 1));

    }

    protected Callable<Boolean> unitPriceBecomes(long orderItemId, BigDecimal unitPrice) {
        return() -> {
            HttpResponse<@Valid OrderItem> orderItemResponse = orderItemsApi.getOrderItem(orderItemId);
            if (orderItemResponse.getBody().isPresent()) {
                return unitPrice.equals(orderItemResponse.getBody().get().getUnitPrice());
            }
            return false;
        };

    }

    protected Callable<Boolean> totalAmountBecomes(long orderId, BigDecimal totalAmount) {
        return () -> {
          HttpResponse<@Valid Order> orderResponse = ordersApi.getOrder1(orderId);
          if (orderResponse.getBody().isPresent()) {
              return totalAmount.equals(orderResponse.getBody().get().getTotalAmount());
          }
          return false;
        };
    }

    protected Callable<Boolean> ordersByDayBecomes(long productId, LocalDate date, int expectedCount) {
        return () -> {
            HttpResponse<List<OrdersByDay>> response = ordersByDayApi.listOrdersByDay();
            if (response.getBody().isPresent()) {
                return response.getBody().get().stream()
                        .anyMatch(obd ->
                                date.equals(obd.getDay()) &&
                                        expectedCount == obd.getCount() &&
                                        obd.getProductId() == productId
                        );
            }
            return false;
        };
    }

}
