package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.annotation.Controller;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.repository.OrderRepository;

@Controller(OrdersController.PREFIX)
public class OrdersController {
    public static final String PREFIX = "/orders";

    @Inject
    OrderRepository orderRepository;
}
