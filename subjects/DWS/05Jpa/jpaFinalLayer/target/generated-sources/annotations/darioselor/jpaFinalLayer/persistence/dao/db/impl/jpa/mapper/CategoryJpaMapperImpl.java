package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Category;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.CategoryEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-03T07:54:08+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class CategoryJpaMapperImpl implements CategoryJpaMapper {

    @Override
    public Category toCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryEntity.getId() );
        category.setNameEn( categoryEntity.getNameEn() );
        category.setSlug( categoryEntity.getSlug() );

        return category;
    }

    @Override
    public CategoryEntity toCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        if ( category.getId() != null ) {
            categoryEntity.setId( category.getId() );
        }
        categoryEntity.setNameEn( category.getNameEn() );
        categoryEntity.setSlug( category.getSlug() );

        return categoryEntity;
    }
}
