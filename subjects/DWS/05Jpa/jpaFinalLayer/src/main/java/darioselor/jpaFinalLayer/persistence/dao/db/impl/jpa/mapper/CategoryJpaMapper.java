package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Category;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryJpaMapper {
    CategoryJpaMapper INSTANCE = Mappers.getMapper(CategoryJpaMapper.class);

    Category toCategory(CategoryEntity categoryEntity);

    CategoryEntity toCategoryEntity(Category category);
}
