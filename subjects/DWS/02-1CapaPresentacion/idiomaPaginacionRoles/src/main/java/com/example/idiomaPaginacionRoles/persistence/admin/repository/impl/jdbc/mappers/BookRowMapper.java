package com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc.mappers;

import com.example.idiomaPaginacionRoles.domain.admin.model.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper {
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setIsbn(rs.getString("isbn"));
    }
}
