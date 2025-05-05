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
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import uk.ac.york.eng2.products.repository.TagRepository;

import java.net.URI;
import java.util.*;


@Controller("/products")
public class ProductsController {
    @Inject
    private ProductRepository productRepository;

    @Inject
    private OrdersByDayRepository ordersByDayRepository;

    @Inject
    private TagRepository tagRepository;

    @Get
    public List<Product> getProducts() {
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

    @Get("/{id}/tags")
    public List<Tag> getProductTags(@PathVariable long id) {
        return tagRepository.findByProductsId(id);
    }

    @Transactional
    @Put("/{id}/tags/{tagId}")
    public void addProductTag(@PathVariable long id, @PathVariable long tagId) {
        ProductTag result = getProductTag(id, tagId);
        result.product.getTags().add(result.tag);
        productRepository.save(result.product);
    }

    @Transactional
    @Delete("/{id}/tags/{tagId}")
    public void removeProductTag(@PathVariable long id, @PathVariable long tagId) {
        ProductTag result = getProductTag(id, tagId);
        result.product.getTags().remove(result.tag);
        productRepository.save(result.product());
    }

    private record ProductTag(Product product, Tag tag) {}

    private ProductTag getProductTag(long id, long tagId) {
        @NonNull Optional<Tag> oTag = tagRepository.findById(tagId);
        if (!oTag.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Tag not found");
        }
        Tag tag = oTag.get();

        @NonNull Optional<Product> oProduct = productRepository.findById(id);
        if (!oProduct.isPresent()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        Product product = oProduct.get();
        ProductTag result = new ProductTag(product, tag);

        return result;
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
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        else {
            productRepository.deleteById(id);
        }
    }
}

