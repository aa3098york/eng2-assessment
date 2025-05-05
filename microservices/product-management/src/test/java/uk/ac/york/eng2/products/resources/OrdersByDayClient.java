package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.OrdersByDayCreateDTO;

import java.util.List;

@Client("/orders-by-day/")
public interface OrdersByDayClient {

    @Get
    List<OrdersByDay> listOrdersByDay();

    @Get("/{id}")
    OrdersByDay getOrdersByDay(@PathVariable long id);


    @Get("/{id}/product")
    HttpResponse<Product> getOrderByDayProduct(@PathVariable long id);

    @Post
    HttpResponse<Void> createOrdersByDay(@Body OrdersByDayCreateDTO dto);


    @Put("/{id}")
    HttpResponse updateOrdersByDay(@PathVariable long id, @Body OrdersByDayCreateDTO dto);

    @Delete("/{id}")
    HttpResponse deleteOrdersByDay(@PathVariable long id);
}

