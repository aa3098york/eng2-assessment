package uk.ac.york.eng2.products.events;

import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;

@Serdeable
public record OrderInfo(long product_id, LocalDate orderDay) {

}
