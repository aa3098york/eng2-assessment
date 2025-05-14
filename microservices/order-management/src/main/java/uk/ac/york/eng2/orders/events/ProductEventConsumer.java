package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

@KafkaListener(groupId = "order-service")
public class ProductEventConsumer {
    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    OrderRepository orderRepository;

    @Topic(ProductTopics.TOPIC_ORDER_ITEM_ADDED)
    public void addOrderItem(long orderId, ProductInfo productInfo) {
        if(orderRepository.findById(orderId).isPresent()) {
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(productInfo.product_id());
            orderItem.setUnitPrice(productInfo.unitPrice());
            orderItem.setOrder(orderRepository.findById(orderId).get());
        }
    }
}
