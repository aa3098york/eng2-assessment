package uk.ac.york.eng2.products.events;

import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public record OrderInfoList(List<OrderInfo> orderInfos) {
}
