package uk.ac.york.eng2.products.resources;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Controller("/orders-by-day")
public class OrdersByDayController {
    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @Inject
    private ProductRepository productRepository;

    @Get
    public @NonNull List<OrdersByDay> listOrdersByDay() {
        return ordersByDayRepository.findAll();
    }

    @Get("/{id}")
    public OrdersByDay getOrdersByDay(@PathVariable long id) {
        return ordersByDayRepository.findById(id).orElse(null);
    }

    @Transactional
    @Get("/{id}/product")
    public Product getOrderByDayProduct(@PathVariable long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createOrdersByDay(@Body OrdersByDayCreateDTO dto) {
        OrdersByDay obd = new OrdersByDay();

        obd.setCount(dto.getCount());
        obd.setDay(dto.getDay());

        @NonNull Optional<Product> product = productRepository.findById(dto.getProductId());
        if (!product.isPresent()) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Product not found");
        }
        obd.setProduct(product.get());

        obd = ordersByDayRepository.save(obd);
        return HttpResponse.created(URI.create("/orders-by-day/" + obd.getId()));
    }

    @Transactional
    @Put("/{id}")
    public void updateProduct(@PathVariable long id, @Body OrdersByDayCreateDTO dto) {
        @NonNull Optional<OrdersByDay> o_obd = ordersByDayRepository.findById(id);
        if (o_obd.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        OrdersByDay obd = o_obd.get();

        obd.setCount(dto.getCount());
        obd.setDay(dto.getDay());

        @NonNull Optional<Product> product = productRepository.findById(dto.getProductId());
        if (!product.isPresent()) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Product not found");
        }
        obd.setProduct(product.get());

        ordersByDayRepository.save(obd);
    }

    @Delete("/{id}")
    public void deleteProduct(@PathVariable long id) {
        if(!ordersByDayRepository.existsById(id)){
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "HTTP ERROR 404: ORDER BY DAY NOT FOUND");
        }
        else {
            ordersByDayRepository.deleteById(id);
        }
    }
}
