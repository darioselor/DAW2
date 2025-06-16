package darioselor.jpaFinalLayer.domain._3service.impl;

import darioselor.jpaFinalLayer.domain._1model.Category;
import darioselor.jpaFinalLayer.domain._3service.CategoryService;
import darioselor.jpaFinalLayer.domain._4repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id));
    }
}
