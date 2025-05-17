package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;

import java.util.List;

@Client("/orders")
public interface OrdersClient {
    @Get
    List<Order> getOrders();

    @Get("/{id}")
    Order getOrder(@PathVariable long id);

    @Get("/{id}/customer")
    HttpResponse<Customer> getOrderCustomer(@PathVariable long id);

    @Get("/{id}/order-items")
    List<OrderItem> getOrderItems(@PathVariable long id);

    @Post
    HttpResponse<Void> createOrder(@Body OrderCreateDTO dto);

    @Put("/{id}")
    HttpResponse updateOrder(@PathVariable long id, @Body OrderUpdateDTO dto);

    @Delete("/{id}")
    HttpResponse deleteOrder(@PathVariable long id);
}
