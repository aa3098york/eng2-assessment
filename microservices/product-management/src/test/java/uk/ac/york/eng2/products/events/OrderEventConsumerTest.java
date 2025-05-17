package uk.ac.york.eng2.products.events;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest(transactional = false)
public class OrderEventConsumerTest {
    @Inject
    OrderEventConsumer consumer;

    @Inject
    OrdersByDayRepository ordersByDayRepository;

    @Inject
    ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        ordersByDayRepository.deleteAll();
    }

    @Test
    public void orderPlaced() {
        List<OrderInfo> orderInfos = new ArrayList<>();
        LocalDate date = LocalDate.of(2024, 12, 25);

        orderInfos.add(new OrderInfo(1, date));


        consumer.orderPlaced(1L, new OrderInfoList(orderInfos));

        assertEquals(1, ordersByDayRepository.findAll().size());

        OrdersByDay ordersByDay = ordersByDayRepository.findByProductIdAndDay(1L, date).orElse(null);

        assert ordersByDay != null;
        assertEquals(date, ordersByDay.getDay());

        assertEquals(1, ordersByDay.getCount());

    }

    @Test
    public void orderUpdated() {
        List<OrderInfo> oldOrderInfos = new ArrayList<>();
        LocalDate date = LocalDate.of(2024, 12, 25);

        oldOrderInfos.add(new OrderInfo(1, date));

        List<OrderInfo> newOrderInfos = new ArrayList<>();

        newOrderInfos.add(new OrderInfo(2, date));

        OrderInfoChanges changes = new OrderInfoChanges(oldOrderInfos, newOrderInfos);

        Product product = productRepository.findById(1L).orElse(null);

        System.out.println(product.getName());

        OrdersByDay ordersByDay = new OrdersByDay();
        ordersByDay.setDay(date);
        ordersByDay.setCount(2);
        ordersByDay.setProduct(product);
        ordersByDayRepository.save(ordersByDay);

        consumer.orderUpdated(1L, changes);

        assertEquals(2, ordersByDayRepository.findAll().size());

        OrdersByDay check1 = ordersByDayRepository.findByProductIdAndDay(1L, date).orElse(null);

        OrdersByDay check2 = ordersByDayRepository.findByProductIdAndDay(2L, date).orElse(null);

        assert check1 != null;
        assertEquals(1, check1.getCount());

        assert check2 != null;
        assertEquals(1, check2.getCount());
    }



    @Test
    public void orderDeleted() {
        List<OrderInfo> orderInfos = new ArrayList<>();
        LocalDate date = LocalDate.of(2024, 12, 25);

        orderInfos.add(new OrderInfo(1, date));

        OrdersByDay ordersByDay = new OrdersByDay();
        ordersByDay.setDay(date);
        ordersByDay.setCount(1);
        ordersByDay.setProduct(productRepository.findById(1L).orElse(null));

        ordersByDayRepository.save(ordersByDay);

        consumer.orderDeleted(1L, new OrderInfoList(orderInfos));

        OrdersByDay fetched = ordersByDayRepository.findByProductIdAndDay(1L, date).orElse(null);
        assert fetched != null;
        assertEquals(0, fetched.getCount());

    }
}
