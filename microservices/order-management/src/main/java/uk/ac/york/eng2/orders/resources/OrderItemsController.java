package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.annotation.Controller;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;

@Controller(OrderItemsController.PREFIX)
public class OrderItemsController {
    public static final String PREFIX = "/order-items";

    @Inject
    OrderItemRepository orderItemRepository;
}
