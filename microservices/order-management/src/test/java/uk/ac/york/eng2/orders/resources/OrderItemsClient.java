package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;

import java.util.List;
@Client("/order-items")
public interface OrderItemsClient {
    @Get
    List<OrderItem> getOrderItems();

    @Get("/{id}")
    OrderItem getOrderItem(@PathVariable long id);

    @Get("/{id}/order")
    HttpResponse<Order> getOrder(@PathVariable long id);

    @Post
    HttpResponse<Void> createOrderItem(OrderItemCreateDTO dto);

    @Put("/{id}")
    HttpResponse updateOrderItem(@PathVariable long id,@Body OrderItemCreateDTO dto);

    @Delete("/{id}")
    HttpResponse deleteOrderItem(@PathVariable long id);
}
