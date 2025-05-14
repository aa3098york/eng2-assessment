package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@KafkaListener(groupId = "product-service")
public class OrderEventConsumer {
    @Inject
    private OrdersByDayRepository ordersByDayRepository;
    @Inject
    private ProductRepository productRepository;

    @Topic(OrderTopics.TOPIC_ORDER_PLACED)
    public HttpStatus orderPlaced(@KafkaKey long orderId, List<OrderInfo> orderInfos) {

        for (OrderInfo orderInfo : orderInfos) {
            if(!productRepository.findById(orderInfo.product_id()).isPresent()) {
                return HttpStatus.NOT_FOUND;
            }
        }
        for (OrderInfo info : orderInfos) {
            addToOrdersByDay(info);
        }
        return HttpStatus.OK;
    }


    @Topic(OrderTopics.TOPIC_ORDER_UPDATED)
    public HttpStatus orderUpdated(@KafkaKey long orderId, OrderInfoChanges orderInfoChanges) {
        for(OrderInfo orderInfo : orderInfoChanges.newOrderInfos()){
            if(!productRepository.findById(orderInfo.product_id()).isPresent()) {
                return HttpStatus.NOT_FOUND;
            }
        }
        for(OrderInfo orderInfo : orderInfoChanges.oldOrderInfos()){
            removeFromOrdersByDay(orderInfo);
        }
        for(OrderInfo orderInfo : orderInfoChanges.newOrderInfos()){
            addToOrdersByDay(orderInfo);
        }
        return HttpStatus.OK;
    }

    @Topic(OrderTopics.TOPIC_ORDER_DELETED)
    public HttpStatus orderDeleted(@KafkaKey long orderId, List<OrderInfo> orderInfos) {
        for(OrderInfo orderInfo : orderInfos) {
            if(!productRepository.findById(orderInfo.product_id()).isPresent()) {
                return HttpStatus.NOT_FOUND;
            }
        }
        for(OrderInfo orderInfo : orderInfos) {
            removeFromOrdersByDay(orderInfo);
        }
        return HttpStatus.OK;
    }




    private void addToOrdersByDay(OrderInfo info) {
        Optional<OrdersByDay> existingRecord = ordersByDayRepository.findByProductIdAndDay(info.product_id(), info.orderDay());

        if (existingRecord.isPresent()) {
            OrdersByDay record = existingRecord.get();
            record.setCount(record.getCount() + 1);
            ordersByDayRepository.save(record);
        } else {
            OrdersByDay newRecord = new OrdersByDay();

            Optional<Product> oProduct = productRepository.findById(info.product_id());
            oProduct.ifPresent(newRecord::setProduct);

            newRecord.setDay(info.orderDay());
            newRecord.setCount(1);

            ordersByDayRepository.save(newRecord);
        }
    }

    private void removeFromOrdersByDay(OrderInfo info) {
        Optional<OrdersByDay> existingRecord = ordersByDayRepository.findByProductIdAndDay(info.product_id(), info.orderDay());

        if (existingRecord.isPresent()) {
            OrdersByDay record = existingRecord.get();
            record.setCount(Math.max(record.getCount() - 1, 0));
            ordersByDayRepository.save(record);
        }
    }
}

