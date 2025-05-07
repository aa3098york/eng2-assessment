package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderItemCreateDTO;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Tag(name="order-items")
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
        return orderRepository.findByOrderItemsId(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createOrderItem(OrderItemCreateDTO dto) {
        OrderItem orderItem = new OrderItem();
        //unitPrice defaults to 0 and can never be null
        if(dto.getOrderId() == null || dto.getProductId() == null ||
                dto.getQuantity() == null) {
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

    @Transactional
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
        orderItem.setProductId(dto.getProductId());
        Optional<Order> order = orderRepository.findById(dto.getOrderId());
        if(!order.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        orderItem.setOrder(order.get());
        orderItemRepository.save(orderItem);
    }

    @Transactional
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
