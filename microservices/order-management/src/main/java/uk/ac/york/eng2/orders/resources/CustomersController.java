package uk.ac.york.eng2.orders.resources;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

@Controller()
public class CustomersController {
    public static final String PREFIX = "/customers";

    @Inject
    CustomerRepository customerRepository;

    @Get
    public @NonNull <Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
