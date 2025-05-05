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
    public List<OrderItem> getOrderItems();

    @Get("/{id}")
    public OrderItem getOrderItem(@PathVariable long id);

    @Get("/{id}/order")
    public Order getOrder(@PathVariable long id);

    @Post
    public HttpResponse<Void> createOrderItem(OrderItemCreateDTO dto);

    @Put("/{id}")
    public void updateOrderItem(@PathVariable long id,@Body OrderItemCreateDTO dto);

    @Delete("/{id}")
    public void deleteOrderItem(@PathVariable long id);
}
