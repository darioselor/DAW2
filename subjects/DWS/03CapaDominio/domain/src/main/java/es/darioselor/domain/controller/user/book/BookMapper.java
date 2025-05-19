package es.darioselor.domain.controller.user.book;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PublisherMapper.class, AuthorMapper.class, GenreMapper.class})
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(BookUser bookUser);

    @Mapping(target = "category", source = "category.name")
    BookDetail toBookDetail(BookUser bookUser);
}
