package uk.ac.york.eng2.orders.events;

import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public record ProductInfoChanges(List<OrderInfo> oldOrderInfos, List<OrderInfo> newOrderInfos) {
}
