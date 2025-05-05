package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;

import java.util.List;

@Client("/orders")
public interface OrdersClient {
    @Get
    public List<Order> getOrders();

    @Get("/{id}")
    public Order getOrder(@PathVariable long id);

    @Get("/{id}/customer")
    public Customer getOrderCustomer(@PathVariable long id);

    @Get("/{id}/order-items")
    public List<OrderItem> getOrderItems(@PathVariable long id);

    @Post
    public HttpResponse<Void> createOrder(@Body OrderCreateDTO dto);

    @Put("/{id}")
    public void updateOrder(@PathVariable long id, OrderCreateDTO dto);

    @Delete("/{id}")
    public void deleteOrder(@PathVariable long id);
}
