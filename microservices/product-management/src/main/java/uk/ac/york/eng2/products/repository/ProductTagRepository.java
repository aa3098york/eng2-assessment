package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.ProductTag;

import java.util.List;

@Repository
public interface ProductTagRepository extends PageableRepository<ProductTag, Long> {
    List<ProductTag> findByProductsId(Long id);
}

