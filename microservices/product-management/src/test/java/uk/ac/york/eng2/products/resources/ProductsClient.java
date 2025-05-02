package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;

import java.util.List;

public interface ProductsClient {
    @Get
    List<Product> getProducts();

    @Get("/{id}")
    Product getProduct(@PathVariable long id);

    @Post
    HttpResponse<Void> createProduct(@Body ProductCreateDTO dto);

    @Put("/{id}")
    HttpResponse updateProduct(@PathVariable long id, @Body ProductCreateDTO dto);

    @Delete("/{id}")
    HttpResponse deleteProduct(@PathVariable long id);
}
