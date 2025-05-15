package es.darioselor.domain.controller.user.webModel.Book;

import es.darioselor.domain.controller.user.webModel.Author.AuthorMapper;
import es.darioselor.domain.controller.user.webModel.Genre.GenreMapper;
import es.darioselor.domain.controller.user.webModel.Publisher.PublisherMapper;
import es.darioselor.domain.domain.user.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        PublisherMapper.class,
        AuthorMapper.class,
        GenreMapper.class
})
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    @Mapping(target = "category", source = "category.name")
    BookDetail toBookDetail(Book book);
}
