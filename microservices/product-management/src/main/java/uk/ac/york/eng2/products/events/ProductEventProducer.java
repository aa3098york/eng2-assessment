package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;

import java.util.List;

@KafkaClient
public interface ProductEventProducer {
    @Topic(ProductTopicFactory.TOPIC_UNIT_PRICING_CONFIRMATION)
    public void confirmOrder(@KafkaKey long orderId, List<ProductInfo> productInfos);

    @Topic(ProductTopicFactory.TOPIC_ORDER_ITEM_ADDED)
    public void addOrderItem(@KafkaKey long orderId, ProductInfo productInfo);
}
