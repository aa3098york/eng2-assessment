package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;

import java.util.List;

@KafkaClient
public interface OrderEventProducer {
    @Topic(OrderTopicFactory.TOPIC_ORDER_PLACED)
    void orderPlaced(@KafkaKey long orderId, OrderInfoList orderInfoList);

    @Topic(OrderTopicFactory.TOPIC_ORDER_UPDATED)
    void orderUpdated(@KafkaKey long orderId, OrderInfoChanges orderInfoChanges);

    @Topic(OrderTopicFactory.TOPIC_ORDER_DELETED)
    void orderDeleted(@KafkaKey long orderId, OrderInfoList orderInfoList);
}
