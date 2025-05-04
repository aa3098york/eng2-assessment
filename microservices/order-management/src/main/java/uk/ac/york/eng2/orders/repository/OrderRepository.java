package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.orders.domain.Order;

@Repository
public interface OrderRepository extends PageableRepository<Order, Long> {
}
