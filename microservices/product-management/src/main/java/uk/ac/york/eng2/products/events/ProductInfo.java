package uk.ac.york.eng2.products.events;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductInfo(long product_id, BigDecimal unitPrice) {
}
