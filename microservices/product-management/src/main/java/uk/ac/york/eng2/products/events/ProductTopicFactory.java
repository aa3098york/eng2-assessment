package uk.ac.york.eng2.products.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class ProductTopicFactory {
    public static final String TOPIC_UNIT_PRICING_CONFIRMATION = "unit_pricing_confirmation";

    @Bean
    public NewTopic orderPlacedTopic() {
        return new NewTopic(TOPIC_UNIT_PRICING_CONFIRMATION, 3, (short) 1);
    }

}
