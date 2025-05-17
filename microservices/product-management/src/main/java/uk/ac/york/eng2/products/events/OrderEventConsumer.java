package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;
import io.micronaut.messaging.annotation.SendTo;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import org.hibernate.query.Order;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@KafkaListener(groupId = "product-service")
public class OrderEventConsumer {
    @Inject
    private OrdersByDayRepository ordersByDayRepository;
    @Inject
    private ProductRepository productRepository;
    @Inject
    private ProductEventProducer productEventProducer;


    @Transactional
    @Topic(OrderTopics.TOPIC_ORDER_PLACED)
    public void orderPlaced(@KafkaKey long orderId, OrderInfoList orderInfoList) {
        List<OrderInfo> orderInfos = orderInfoList.orderInfos();
        List<OrderInfo> validOrderInfos = new ArrayList<>();
        for (OrderInfo orderInfo : orderInfos) {
            if(productRepository.findById(orderInfo.product_id()).isPresent()) {
                validOrderInfos.add(orderInfo);
            }
            else {
                productEventProducer.invalidProductId(orderId, orderInfo.product_id());
            }
        }
        for (OrderInfo info : validOrderInfos) {
            addToOrdersByDay(info);
        }

        UpdateOrderPricing(orderId, validOrderInfos);
    }

    @Transactional
    @Topic(OrderTopics.TOPIC_ORDER_UPDATED)
    public void orderUpdated(@KafkaKey long orderId, OrderInfoChanges orderInfoChanges) {
        List<OrderInfo> validOrderInfos = new ArrayList<>();
        for(OrderInfo orderInfo : orderInfoChanges.newOrderInfos()){
            if(productRepository.findById(orderInfo.product_id()).isPresent()) {
                validOrderInfos.add(orderInfo);
            }
            else {
                productEventProducer.invalidProductId(orderId, orderInfo.product_id());
            }
        }
        for(OrderInfo orderInfo : orderInfoChanges.oldOrderInfos()){
            removeFromOrdersByDay(orderInfo);
        }
        for(OrderInfo orderInfo : validOrderInfos){
            addToOrdersByDay(orderInfo);
        }
        System.out.println(validOrderInfos);
        UpdateOrderPricing(orderId, validOrderInfos);

    }

    @Transactional
    @Topic(OrderTopics.TOPIC_ORDER_DELETED)
    public void orderDeleted(@KafkaKey long orderId, OrderInfoList orderInfoList) {
        List<OrderInfo> validOrderInfos = new ArrayList<>();
        List<OrderInfo> orderInfos = orderInfoList.orderInfos();
        for(OrderInfo orderInfo : orderInfos) {
            if(productRepository.findById(orderInfo.product_id()).isPresent()) {
                validOrderInfos.add(orderInfo);
            }
        }
        for(OrderInfo orderInfo : validOrderInfos) {
            removeFromOrdersByDay(orderInfo);
        }

        UpdateOrderPricing(orderId, validOrderInfos);
    }

    private void UpdateOrderPricing(long orderId, List<OrderInfo> validOrderInfos) {
        List<ProductInfo> productInfos = new ArrayList<>();
        for(OrderInfo orderInfo : validOrderInfos){
            Optional<Product> productOptional = productRepository.findById(orderInfo.product_id());
            if(productOptional.isPresent()) {
                Product product = productOptional.get();
                productInfos.add(new ProductInfo(orderInfo.product_id(), product.getUnitPrice()));
            }
        }

        productEventProducer.confirmOrder(orderId, new ProductInfoList(productInfos));
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

