package uk.ac.york.eng2.products.events;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;
import java.time.LocalDate;


@Serdeable
public record ProductInfo(long product_id, BigDecimal unitPrice) {
}
