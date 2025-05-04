package uk.ac.york.eng2.products.resources;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductTagCreateDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.ProductTagRepository;
import uk.ac.york.eng2.products.domain.ProductTag;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Tag(name="Tags")
@Controller("/tags")
public class ProductTagsController {
    @Inject
    private ProductTagRepository tagRepository;

    @Inject
    private ProductRepository productRepository;

    @Get
    public List<ProductTag> listTags() {
        return tagRepository.findAll();
    }

    @Get("/{id}")
    public ProductTag getTag(@PathVariable Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    @Get("/{id}/products")
    public List<Product> listProducts(@PathVariable Long id) {
        return productRepository.findByTagsId(id);
    }

    @Post
    public HttpResponse<Void> createTag(@Body ProductTagCreateDTO dto) {
        ProductTag tag = new ProductTag();
        tag.setName(dto.getName());

        tag = tagRepository.save(tag);
        return HttpResponse.created(URI.create("/tags/" + tag.getId()));
    }

    @Transactional
    @Put("/{id}")
    public void updateTag(@Body ProductTagCreateDTO dto, @PathVariable long id) {
        @NonNull Optional<ProductTag> oProductTag = tagRepository.findById(id);
        if (!oProductTag.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }

        ProductTag tag = oProductTag.get();
        tag.setName(dto.getName());
        tag = tagRepository.save(tag);
    }

    @Delete("/{id}")
    public void deleteTag(@PathVariable long id) {
        if (!tagRepository.existsById(id)) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }
        tagRepository.deleteById(id);
    }
}
