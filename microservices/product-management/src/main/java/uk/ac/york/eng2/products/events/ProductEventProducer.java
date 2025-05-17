package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;

import java.util.List;

@KafkaClient
public interface ProductEventProducer {
    @Topic(ProductTopicFactory.TOPIC_UNIT_PRICING_CONFIRMATION)
    public void confirmOrder(@KafkaKey long orderId, ProductInfoList productInfoList);

    @Topic(ProductTopicFactory.TOPIC_INVALID_PRODUCT)
    public void invalidProductId(@KafkaKey long orderId, long productId);
}
