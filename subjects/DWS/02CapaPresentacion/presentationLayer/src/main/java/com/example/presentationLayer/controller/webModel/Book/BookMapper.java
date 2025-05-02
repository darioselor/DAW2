package com.example.presentationLayer.controller.webModel.Book;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.presentationLayer.controller.webModel.Author.AuthorMapper;
import com.example.presentationLayer.controller.webModel.Genre.GenreMapper;
import com.example.presentationLayer.controller.webModel.Publisher.PublisherMapper;
import com.example.presentationLayer.domain.model.Book;

@Mapper(uses = { PublisherMapper.class, AuthorMapper.class, GenreMapper.class })
public interface BookMapper {

    BookMapper INTSTANCE = Mappers.getMapper(BookMapper.class);

    BookCollection toBookCollection(Book book);

    @Mapping(target = "publisherCollection", source = "publisher")
    @Mapping(target = "authorsCollection", source = "authors")
    @Mapping(target = "category", source = "category.name")
    @Mapping(target = "genres", source = "genres")
    BookDetail toBookDetail(Book book);

}
