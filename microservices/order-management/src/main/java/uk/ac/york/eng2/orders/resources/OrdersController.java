package uk.ac.york.eng2.orders.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrderUpdateDTO;
import uk.ac.york.eng2.orders.events.OrderEventProducer;
import uk.ac.york.eng2.orders.events.OrderInfo;
import uk.ac.york.eng2.orders.events.OrderInfoList;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Tag(name="orders")
@Controller(OrdersController.PREFIX)
public class OrdersController {
    public static final String PREFIX = "/orders";

    @Inject
    OrderRepository orderRepository;

    @Inject
    CustomerRepository customerRepository;

    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    OrderEventProducer orderEventProducer;

    @Get
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Get("/{id}")
    public Order getOrder(@PathVariable long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Get("/{id}/customer")
    public Customer getOrderCustomer(@PathVariable long id) {
        return customerRepository.findByOrdersId(id).orElse(null);
    }

    @Get("/{id}/order-items")
    public List<OrderItem> getOrderItems(@PathVariable long id) {
        return orderItemRepository.findByOrderId(id);
    }
    
    @Post
    public HttpResponse<Void> createOrder(@Body OrderCreateDTO dto) {
        Order order = new Order();
        if(dto.getAddress() == null || dto.getCustomerId() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }
        order.setAddress(dto.getAddress());
        order.setPaid(false);
        order.setDelivered(false);

        Optional<Customer> customer = customerRepository.findById(dto.getCustomerId());
        if (customer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        order.setCustomer(customer.get());

        orderRepository.save(order);
        return HttpResponse.created(URI.create(PREFIX + "/" + order.getId()));
    }

    @Transactional
    @Put("/{id}")
    public void updateOrder(@PathVariable long id, @Body OrderUpdateDTO dto) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if (optionalOrder.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        if(dto.getAddress() == null || dto.getCustomerId() == null || dto.getPaid() == null
        || dto.getDelivered() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }
        Order order = optionalOrder.get();
        order.setAddress(dto.getAddress());
        order.setPaid(dto.getPaid());
        order.setDelivered(dto.getDelivered());
        Optional<Customer> customer = customerRepository.findById(dto.getCustomerId());
        if (customer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        order.setCustomer(customer.get());
        orderRepository.save(order);
    }

    @Transactional
    @Delete("/{id}")
    public void deleteOrder(@PathVariable long id) {
        if(!orderRepository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        else {
            List<OrderItem> orderItems = orderItemRepository.findByOrderId(id);
            if (!orderItems.isEmpty()) {
                Optional<Order> optionalOrder = orderRepository.findById(id);
                if (optionalOrder.isEmpty()) {
                    throw new HttpStatusException(HttpStatus.NOT_FOUND, "Order not found");
                }
                Order orderEntity = optionalOrder.get();
                List<OrderInfo> orderInfos = orderItems
                        .stream()
                        .map(oi -> new OrderInfo(oi.getProductId(), orderEntity.getDateCreated()))
                        .toList();

                orderEventProducer.orderDeleted(orderEntity.getId(), new OrderInfoList(orderInfos));
                for(OrderItem orderItem : orderItems) {
                    orderItemRepository.deleteById(orderItem.getId());
                }
            }
            orderRepository.deleteById(id);
        }

    }
}
