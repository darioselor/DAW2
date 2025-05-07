package com.example.idiomaPaginacionRoles.persistence.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.idiomaPaginacionRoles.controller.locale.LanguageUtils;
import com.example.idiomaPaginacionRoles.domain.model.Book;

public class BookRowMapper implements CustomRowMapper<Book> {

    PublisherRowMapper publisherRowMapper = new PublisherRowMapper();
    CategoryRowMapper categoryRowMapper = new CategoryRowMapper();

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLenguage();
        Book book = new Book();
        book.setIsbn(rs.getString("books.isbn"));
        book.setTitle(rs.getString("books.title_" + language));
        book.setSynopsis(rs.getString("books.synopsis_" + language));
        book.setPrice(rs.getFloat("books.price"));
        book.setDiscount(rs.getFloat("books.discount"));
        book.setCover(rs.getString("books.cover"));

        if (this.existsColumn(rs, "publishers.id")) {
            book.setPublisher(publisherRowMapper.mapRow(rs, rowNum));
        }
        if (this.existsColumn(rs, "categories.id")) {
            book.setCategory(categoryRowMapper.mapRow(rs, rowNum));
        }
        return book;
    }

}