package darioselor.jpaFinalLayer.domain._3service;

import darioselor.jpaFinalLayer.domain._1model.Category;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> findById(Long id);
}

