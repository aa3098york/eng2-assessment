package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@KafkaListener(groupId = "order-service")
public class ProductEventConsumer {
    @Inject
    OrderItemRepository orderItemRepository;

    @Inject
    OrderRepository orderRepository;

    @Transactional
    @Topic(ProductTopics.TOPIC_UNIT_PRICING_CONFIRMATION)
    public void confirmOrder(@KafkaKey long orderId, ProductInfoList productInfoList) {
        List<ProductInfo> productInfos = productInfoList.productInfos();
        Optional<Order> o_order = orderRepository.findById(orderId);
        if (o_order.isPresent()) {
            Order order = o_order.get();

            // Set total amount back to zero so we can sum it up again
            order.setTotalAmount(BigDecimal.ZERO);

            //Set unit price and add to total price for each product
            for (ProductInfo productInfo : productInfos) {
                Optional<OrderItem> o_orderItem = orderItemRepository.findByOrderIdAndProductId(orderId, productInfo.product_id());
                if(o_orderItem.isPresent()) {
                    OrderItem orderItem = o_orderItem.get();
                    orderItem.setUnitPrice(productInfo.unitPrice());

                    BigDecimal multiplier = new BigDecimal(orderItem.getQuantity());

                    order.setTotalAmount(
                            order.getTotalAmount()
                                    .add(productInfo.unitPrice()
                                            .multiply(multiplier)));
                    orderItemRepository.save(orderItem);
                }
            }

            orderRepository.save(order);

        }

    }

    @Transactional
    @Topic(ProductTopics.TOPIC_INVALID_PRODUCT)
    public void invalidProduct(@KafkaKey long orderId, long product_id) {
        Optional<OrderItem> o_orderItem = orderItemRepository.findByOrderIdAndProductId(orderId, product_id);
        if (o_orderItem.isPresent()) {
            orderItemRepository.deleteById(o_orderItem.get().getId());
        }
    }

}
