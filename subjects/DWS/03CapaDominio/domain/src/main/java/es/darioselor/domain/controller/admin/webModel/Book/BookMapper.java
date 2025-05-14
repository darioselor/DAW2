package es.darioselor.domain.controller.admin.webModel.Book;

import es.darioselor.domain.domain.admin.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(target = "title", source = "book.title")
    BookCollection toBookCollection(Book book);
}
