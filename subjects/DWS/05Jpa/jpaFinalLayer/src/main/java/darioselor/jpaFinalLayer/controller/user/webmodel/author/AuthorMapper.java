package darioselor.jpaFinalLayer.controller.user.webmodel.author;

import darioselor.jpaFinalLayer.domain._1model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);
    AuthorCollection toAuthorCollection(Author author);
}
