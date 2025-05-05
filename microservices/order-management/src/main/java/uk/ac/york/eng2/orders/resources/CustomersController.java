package uk.ac.york.eng2.orders.resources;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.dto.CustomerCreateDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Controller(CustomersController.PREFIX)
public class CustomersController {
    public static final String PREFIX = "/customers";

    @Inject
    CustomerRepository customerRepository;

    @Inject
    OrderRepository orderRepository;

    @Get
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Get("/{id}")
    public Customer getCustomer(@PathVariable long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Get("/{id}/orders")
    public List<Order> getOrders(@PathVariable long id) {
        return orderRepository.findByCustomerId(id);
    }

    @Post
    public HttpResponse<Void> createCustomer(@Body CustomerCreateDTO dto) {
        Customer customer = new Customer();
        if(dto.getFirstName() == null || dto.getEmail() == null || dto.getFamilyName() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }
        customer.setFirstName(dto.getFirstName());
        customer.setFamilyName(dto.getFamilyName());
        customer.setEmail(dto.getEmail());

        customer = customerRepository.save(customer);
        return HttpResponse.created(URI.create(PREFIX + "/" + customer.getId()));
    }

    @Transactional
    @Put("/{id}")
    public void updateCustomer(@PathVariable long id, @Body CustomerCreateDTO dto) {
        @NonNull Optional<Customer> oCustomer = customerRepository.findById(id);
        if (oCustomer.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        if(dto.getFirstName() == null || dto.getEmail() == null || dto.getFamilyName() == null) {
            throw new HttpStatusException(HttpStatus.BAD_REQUEST, "Required fields cannot be null");
        }
        Customer customer = oCustomer.get();
        customer.setEmail(dto.getEmail());
        customer.setFirstName(dto.getFirstName());
        customer.setFamilyName(dto.getFamilyName());

        customerRepository.save(customer);
    }

    @Transactional
    @Delete("/{id}")
    public void deleteCustomer(@PathVariable long id) {
        if(!customerRepository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        else {
            List<Order> orders = orderRepository.findByCustomerId(id);
            if(!orders.isEmpty()) {
                throw new HttpStatusException(HttpStatus.CONFLICT, "Cannot delete Customer because there are orders associated with this id");
            }
            customerRepository.deleteById(id);
        }
    }
}
