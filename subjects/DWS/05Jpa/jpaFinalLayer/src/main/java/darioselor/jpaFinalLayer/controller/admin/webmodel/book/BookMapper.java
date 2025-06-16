package darioselor.jpaFinalLayer.controller.admin.webmodel.book;

import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookCollection;
import darioselor.jpaFinalLayer.domain._1model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(target = "title", source = "book.titleEs")
    BookCollection toBookCollection(Book book);
}
