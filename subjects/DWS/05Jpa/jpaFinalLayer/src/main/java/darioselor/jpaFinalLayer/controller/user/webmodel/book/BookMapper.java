package darioselor.jpaFinalLayer.controller.user.webmodel.book;

import darioselor.jpaFinalLayer.domain._1model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    @Mapping(target = "category", source = "category.nameEs")
    BookDetail toBookDetail(Book book);
}
