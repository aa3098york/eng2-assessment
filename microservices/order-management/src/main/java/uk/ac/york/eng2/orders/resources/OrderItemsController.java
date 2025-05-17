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
import uk.ac.york.eng2.orders.events.OrderEventProducer;
import uk.ac.york.eng2.orders.events.OrderInfo;
import uk.ac.york.eng2.orders.events.OrderInfoChanges;
import uk.ac.york.eng2.orders.events.OrderInfoList;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Tag(name="order-items")
@Controller(OrderItemsController.PREFIX)
public class OrderItemsController {
    public static final String PREFIX = "/order-items";

    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    OrderRepository orderRepository;

    @Inject
    OrderEventProducer orderEventProducer;

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

    @Transactional
    @Post
    public HttpResponse<Void> createOrderItem(@Body OrderItemCreateDTO dto) {
        OrderItem orderItem = new OrderItem();
        if(dto.getOrderId() == null || dto.getProductId() == null ||
                dto.getQuantity() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }

        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());

        Optional<Order> order = orderRepository.findById(dto.getOrderId());
        if(!order.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }

        Order orderEntity = order.get();

        orderItem.setOrder(orderEntity);

        List<OrderInfo> oldOrderInfos = orderItemRepository.findByOrderId(orderItem.getOrder().getId())
                .stream()
                .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                .toList();

        orderItem = orderItemRepository.save(orderItem);

        // Updated
        List<OrderInfo> newOrderInfos = orderItemRepository.findByOrderId(orderEntity.getId())
                .stream()
                .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                .toList();

        if (!oldOrderInfos.isEmpty()) {
            OrderInfoChanges orderInfoChanges = new OrderInfoChanges(oldOrderInfos, newOrderInfos);
            orderEventProducer.orderUpdated(orderEntity.getId(), orderInfoChanges);
            return HttpResponse.created(URI.create(PREFIX + "/" + orderItem.getId()));
        }
        else{
            List<OrderInfo> orderInfos = new ArrayList<>();
            orderInfos.add(new OrderInfo(orderItem.getProductId(), orderEntity.getDateCreated()));
            orderEventProducer.orderPlaced(orderEntity.getId(), new OrderInfoList(orderInfos));
            return HttpResponse.created(URI.create(PREFIX + "/" + orderItem.getId()));
        }

    }

    @Transactional
    @Put("/{id}")
    public void updateOrderItem(@PathVariable long id, @Body OrderItemCreateDTO dto) {
        Optional<OrderItem> optionalOrderItem = orderItemRepository.findById(id);
        if (optionalOrderItem.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
        }

        if (dto.getOrderId() == null || dto.getProductId() == null ||
                dto.getQuantity() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }

        OrderItem orderItem = optionalOrderItem.get();

        Optional<Order> order = orderRepository.findById(dto.getOrderId());
        if (order.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        Order orderEntity = order.get();

        List<OrderInfo> oldOrderInfos = orderItemRepository.findByOrderId(orderItem.getOrder().getId())
                .stream()
                .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                .toList();


        orderItem.setQuantity(dto.getQuantity());
        orderItem.setProductId(dto.getProductId());
        orderItem.setOrder(orderEntity);

        // Create updated snapshot with modified orderItem
        List<OrderItem> updatedItems = orderItemRepository.findByOrderId(orderItem.getOrder().getId())
                .stream()
                .map(oi -> Objects.equals(oi.getId(), orderItem.getId()) ? orderItem : oi) // inject modified item
                .toList();

        List<OrderInfo> newOrderInfos = updatedItems.stream()
                .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                .toList();

        // Fire Kafka event
        OrderInfoChanges orderInfoChanges = new OrderInfoChanges(oldOrderInfos, newOrderInfos);
        orderItemRepository.save(orderItem);
        orderEventProducer.orderUpdated(orderEntity.getId(), orderInfoChanges);
    }


    @Transactional
    @Delete("/{id}")
    public void deleteOrderItem(@PathVariable long id) {
        if(!orderItemRepository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
        }
        else{
            Optional<OrderItem> orderItem = orderItemRepository.findById(id);
            // Just to remove warning
            if(orderItem.isEmpty()) {
                throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order item not found");
            }
            OrderItem orderItemEntity = orderItem.get();
            Order orderEntity = orderItemEntity.getOrder();
            List<OrderInfo> oldOrderInfos = orderItemRepository.findByOrderId(orderItemEntity.getOrder().getId())
                    .stream()
                    .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                    .toList();

            orderItemRepository.deleteById(id);

            // Kafka
            List<OrderInfo> newOrderInfos = orderItemRepository.findByOrderId(orderItemEntity.getOrder().getId())
                    .stream()
                    .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                    .toList();

            OrderInfoChanges orderInfoChanges = new OrderInfoChanges(oldOrderInfos, newOrderInfos);
            orderEventProducer.orderUpdated(orderEntity.getId(), orderInfoChanges);
        }
    }

}
