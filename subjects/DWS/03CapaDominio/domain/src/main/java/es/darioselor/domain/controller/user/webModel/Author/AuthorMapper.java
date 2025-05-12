package es.darioselor.domain.controller.user.webModel.Author;

import es.darioselor.domain.domain.user.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorCollection toAuthorCollection(Author author);
}
