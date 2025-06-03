package com.example.presentationLayer.persistence.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.presentationLayer.domain.model.Author;

public class AuthorRowMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getLong("authors.id"));
        author.setName(rs.getString("authors.name"));
        author.setNationality(rs.getString("authors.nationality"));
        author.setBiography(rs.getString("authors.biography_es"));
        author.setBirthYear(rs.getInt("authors.birth_year"));
        author.setDeathYear(rs.getInt("authors.death_year"));
        return author;
    }

}
