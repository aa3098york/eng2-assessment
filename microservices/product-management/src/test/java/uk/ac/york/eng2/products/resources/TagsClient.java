package uk.ac.york.eng2.products.resources;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagCreateDTO;

import java.util.List;

@Client("/tags")
public interface TagsClient {
    @Get
    public List<Tag> listTags();

    @Get("/{id}")
    public Tag getTag(@PathVariable Long id);

    @Get("/{id}/products")
    List<Product> listProducts(@PathVariable Long id);

    @Post
    HttpResponse<Void> createTag(@Body TagCreateDTO dto);

    @Put("/{id}")
    HttpResponse updateTag(@Body TagCreateDTO dto, @PathVariable long id);

    @Delete("/{id}")
    HttpResponse deleteTag(@PathVariable long id);
}
