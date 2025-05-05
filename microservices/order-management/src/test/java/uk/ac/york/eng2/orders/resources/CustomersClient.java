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
    public List<Customer> getCustomers();

    @Get("/{id}")
    public Customer getCustomer(@PathVariable long id);

    @Get("/{id}/orders")
    public List<Order> getOrders(@PathVariable long id);

    @Post
    public HttpResponse<Void> createCustomer(@Body CustomerCreateDTO dto);

    @Put("/{id}")
    public void updateCustomer(@PathVariable long id, @Body CustomerCreateDTO dto);

    @Delete("/{id}")
    public void deleteCustomer(@PathVariable long id);
}
