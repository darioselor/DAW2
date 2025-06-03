package darioselor.jpaFinalLayer.domain._4repository;

import darioselor.jpaFinalLayer.domain._1model.Category;

import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(long id);
}
