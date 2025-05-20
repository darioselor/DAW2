package com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.idiomaPaginacionRoles.controller.common.locale.LanguageUtils;
import com.example.idiomaPaginacionRoles.domain.user.model.Author;

public class AuthorRowMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Author author = new Author();
        author.setId(rs.getLong("authors.id"));
        author.setName(rs.getString("authors.name"));
        author.setNationality(rs.getString("authors.nationality"));
        author.setBiography(rs.getString("authors.biography_" + language));
        author.setBirthYear(rs.getInt("authors.birth_year"));
        author.setDeathYear(rs.getInt("authors.death_year"));
        return author;
    }

}
