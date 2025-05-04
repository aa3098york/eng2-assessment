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
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

import java.net.URI;
import java.util.*;


@Controller("/products")
public class ProductsController {
    @Inject
    private ProductRepository productRepository;

    private OrdersByDayRepository ordersByDayRepository;

    @Get
    public @NonNull List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Get("/{id}")
    public Product getProduct(@PathVariable long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Get("/{id}/orders-by-day")
    public List<OrdersByDay> listOrdersByDay(@PathVariable long id) {
        return ordersByDayRepository.findByProductId(id);
    }

    @Post
    public HttpResponse<Void> createProduct(@Body ProductCreateDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());

        product = productRepository.save(product);
        return HttpResponse.created(URI.create("/products/" + product.getId()));
    }

    @Transactional
    @Put("/{id}")
    public void updateProduct(@PathVariable long id, @Body ProductCreateDTO dto) {
        @NonNull Optional<Product> oProduct = productRepository.findById(id);
        if (oProduct.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        Product product = oProduct.get();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());

        productRepository.save(product);
    }


    @Transactional
    @Delete("/{id}")
    public void deleteProduct(@PathVariable long id) {
        if(!productRepository.existsById(id)){
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "HTTP ERROR 404: PRODUCT NOT FOUND");
        }
        else {
            productRepository.deleteById(id);
        }
    }
}

