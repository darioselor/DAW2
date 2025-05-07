package com.example.idiomaPaginacionRoles.controller.webModel.Book;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.idiomaPaginacionRoles.controller.webModel.Author.AuthorMapper;
import com.example.idiomaPaginacionRoles.controller.webModel.Genre.GenreMapper;
import com.example.idiomaPaginacionRoles.controller.webModel.Publisher.PublisherMapper;
import com.example.idiomaPaginacionRoles.domain.model.Book;

@Mapper(uses = {
        PublisherMapper.class,
        AuthorMapper.class,
        GenreMapper.class
})
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    @Mapping(target = "publisherCollection", source = "publisher")
    @Mapping(target = "authorCollection", source = "author")
    @Mapping(target = "genres", source = "genres")
    @Mapping(target = "category", source = "category.name")
    BookDetail toBookDetail(Book book);
}
