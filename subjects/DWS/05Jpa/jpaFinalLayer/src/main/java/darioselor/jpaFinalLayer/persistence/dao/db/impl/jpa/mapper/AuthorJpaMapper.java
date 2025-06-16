package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.AuthorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorJpaMapper {
    AuthorJpaMapper INSTANCE = Mappers.getMapper(AuthorJpaMapper.class);

    Author toAuthor(AuthorEntity authorEntity);

    AuthorEntity toAuthorEntity(Author author);
}
