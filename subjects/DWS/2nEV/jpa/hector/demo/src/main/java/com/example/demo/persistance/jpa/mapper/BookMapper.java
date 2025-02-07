package com.example.demo.persistance.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.domain.model.Book;
import com.example.demo.persistance.jpa.entity.BookEntity;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toBook(BookEntity bookEntity);

    BookEntity toBookEntity(Book book);

    List<Book> toBooks(List<BookEntity> bookEntities);

    List<BookEntity> toBookEntities(List<Book> books);
    
}
