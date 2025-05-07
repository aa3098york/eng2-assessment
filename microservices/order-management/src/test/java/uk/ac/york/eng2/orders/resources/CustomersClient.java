package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;

import java.util.List;

@Client("/customers")
public interface CustomersClient {
    @Get
    List<Customer> getCustomers();

    @Get("/{id}")
    Customer getCustomer(@PathVariable long id);

    @Get("/{id}/orders")
    List<Order> getOrders(@PathVariable long id);

    @Post
    HttpResponse<Void> createCustomer(@Body CustomerCreateDTO dto);

    @Put("/{id}")
    HttpResponse updateCustomer(@PathVariable long id, @Body CustomerCreateDTO dto);

    @Delete("/{id}")
    HttpResponse deleteCustomer(@PathVariable long id);
}
