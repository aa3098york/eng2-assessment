package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Controller(OrderItemsController.PREFIX)
public class OrderItemsController {
    public static final String PREFIX = "/order-items";

    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    OrderRepository orderRepository;

    @Get
    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }

    @Get("/{id}")
    public OrderItem getOrderItem(@PathVariable long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    @Get("/{id}/order")
    public Order getOrder(@PathVariable long id) {
        return orderRepository.findByOrderItemsId(id);
    }

    @Post
    public HttpResponse<Void> createOrderItem(OrderItemCreateDTO dto) {
        OrderItem orderItem = new OrderItem();
        if(dto.getOrderId() == null || dto.getProductId() == null ||
                dto.getQuantity() == null || dto.getUnitPrice() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }

        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setUnitPrice(dto.getUnitPrice());

        Optional<Order> order = orderRepository.findById(dto.getOrderId());
        if(!order.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        orderItem.setOrder(order.get());
        orderItem = orderItemRepository.save(orderItem);
        return HttpResponse.created(URI.create(PREFIX + "/" + orderItem.getId()));
    }

    @Put("/{id}")
    public void updateOrderItem(@PathVariable long id,@Body OrderItemCreateDTO dto) {
        Optional<OrderItem> optionalOrderItem = orderItemRepository.findById(id);
        if(!optionalOrderItem.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
        }
        if(dto.getOrderId() == null || dto.getProductId() == null ||
                dto.getQuantity() == null || dto.getUnitPrice() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }
        OrderItem orderItem = optionalOrderItem.get();
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setUnitPrice(dto.getUnitPrice());
        Optional<Order> order = orderRepository.findById(dto.getOrderId());
        if(!order.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        orderItem.setOrder(order.get());
        orderItemRepository.save(orderItem);
    }

    @Delete("/{id}")
    public void deleteOrderItem(@PathVariable long id) {
        if(!orderItemRepository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
        }
        else{
            orderItemRepository.deleteById(id);
        }
    }

}
