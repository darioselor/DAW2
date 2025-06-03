package darioselor.jpaFinalLayer.persistence.repository.impl;

import darioselor.jpaFinalLayer.domain._1model.Category;
import darioselor.jpaFinalLayer.domain._4repository.CategoryRepository;
import darioselor.jpaFinalLayer.persistence.dao.db.CategoryDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryDaoDb categoryDaoDb;

    @Override
    public Optional<Category> findById(long id) {
        return categoryDaoDb.findById(id);
    }
}
