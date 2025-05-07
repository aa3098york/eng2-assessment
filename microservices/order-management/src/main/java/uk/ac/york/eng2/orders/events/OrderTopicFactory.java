package uk.ac.york.eng2.orders.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class OrderTopicFactory {
    public static final String TOPIC_ORDER_PLACED = "order-placed";
    public static final String TOPIC_ORDER_UPDATED = "order-updated";
    public static final String TOPIC_ORDER_DELETED = "order-deleted";

    @Bean
    public NewTopic orderPlacedTopic() {
        return new NewTopic(TOPIC_ORDER_PLACED, 3, (short) 1);
    }

    @Bean
    public NewTopic orderUpdatedTopic() {
        return new NewTopic(TOPIC_ORDER_UPDATED, 3, (short) 1);
    }

    @Bean
    public NewTopic orderDeletedTopic() {
        return new NewTopic(TOPIC_ORDER_DELETED, 3, (short) 1);
    }
}
