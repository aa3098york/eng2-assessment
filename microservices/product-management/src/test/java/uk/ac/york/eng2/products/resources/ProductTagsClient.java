package uk.ac.york.eng2.products.resources;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;
import uk.ac.york.eng2.products.dto.ProductTagCreateDTO;

import java.util.List;

@Client("/tags")
public interface ProductTagsClient {
    @Get
    public List<ProductTag> listTags();

    @Get("/{id}")
    public ProductTag getTag(@PathVariable Long id);

    @Get("/{id}/products")
    public List<Product> listProducts(@PathVariable Long id);

    @Post
    public HttpResponse<Void> createTag(@Body ProductTagCreateDTO dto);

    @Put("/{id}")
    public void updateTag(@Body ProductTagCreateDTO dto, @PathVariable long id);

    @Delete("/{id}")
    public void deleteTag(@PathVariable long id);
}
