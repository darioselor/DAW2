package com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc.mappers;

import com.example.idiomaPaginacionRoles.domain.admin.model.Book;
import com.example.idiomaPaginacionRoles.persistence.common.CustomRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements CustomRowMapper {

    PublisherRowMapper publisherRowMapper = new PublisherRowMapper();
    CategoryRowMapper categoryRowMapper = new CategoryRowMapper();
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setIsbn(rs.getString("isbn"));
        book.setTitleEs(rs.getString("title_es"));
        book.setTitleEn(rs.getString("title_en"));
        book.setSynopsisEs(rs.getString("synopsis_es"));
        book.setSynopsisEn(rs.getString("synopsis_en"));
        book.setPrice(rs.getFloat("books.price"));
        book.setDiscount(rs.getFloat("books.discount"));
        book.setCover(rs.getString("cover"));
        if (this.existsColumn(rs, "publishers.id")){
            book.setPublisher(publisherRowMapper.mapRow(rs, rowNum));
        }
        if (this.existsColumn(rs, "categories.id")){
            book.setCategory(categoryRowMapper.mapRow(rs, rowNum));
        }
        return book;
    }
}
