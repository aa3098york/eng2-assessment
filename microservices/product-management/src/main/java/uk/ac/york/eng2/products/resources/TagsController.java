package uk.ac.york.eng2.products.resources;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.TagCreateDTO;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;
import uk.ac.york.eng2.products.domain.Tag;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@io.swagger.v3.oas.annotations.tags.Tag(name="Tags")
@Controller("/tags")
public class TagsController {
    @Inject
    private TagRepository tagRepository;

    @Inject
    private ProductRepository productRepository;

    @Get
    public List<Tag> listTags() {
        return tagRepository.findAll();
    }

    @Get("/{id}")
    public Tag getTag(@PathVariable Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    @Get("/{id}/products")
    public List<Product> listProducts(@PathVariable Long id) {
        return productRepository.findByTagsId(id);
    }

    @Post
    public HttpResponse<Void> createTag(@Body TagCreateDTO dto) {
        Tag tag = new Tag();
        tag.setName(dto.getName());

        tag = tagRepository.save(tag);
        return HttpResponse.created(URI.create("/tags/" + tag.getId()));
    }

    @Transactional
    @Put("/{id}")
    public void updateTag(@Body TagCreateDTO dto, @PathVariable long id) {
        @NonNull Optional<Tag> oProductTag = tagRepository.findById(id);
        if (!oProductTag.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }

        Tag tag = oProductTag.get();
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
