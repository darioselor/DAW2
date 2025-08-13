package darioselor.jpaFinalLayer.controller.user.webmodel.book;

import darioselor.jpaFinalLayer.controller.user.webmodel.author.AuthorMapper;
import darioselor.jpaFinalLayer.controller.user.webmodel.genre.GenreMapper;
import darioselor.jpaFinalLayer.controller.user.webmodel.publisher.PublisherMapper;
import darioselor.jpaFinalLayer.domain._1model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PublisherMapper.class, AuthorMapper.class, GenreMapper.class})
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    @Mapping(target = "category", source = "category.nameEs")
    BookDetail toBookDetail(Book book);
}
