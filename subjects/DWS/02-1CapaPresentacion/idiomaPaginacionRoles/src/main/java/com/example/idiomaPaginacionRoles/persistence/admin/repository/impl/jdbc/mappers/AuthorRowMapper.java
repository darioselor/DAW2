package com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc.mappers;

import com.example.idiomaPaginacionRoles.controller.common.locale.LanguageUtils;
import com.example.idiomaPaginacionRoles.domain.admin.model.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getLong("authors.id"));
        author.setName(rs.getString("authors.name"));
        author.setNationality(rs.getString("authors.nationality"));
        author.setBiographyEs(rs.getString("authors.biography_es"));
        author.setBiographyEn(rs.getString("authors.biography_en"));
        author.setBirthYear(rs.getInt("authors.birth_year"));
        author.setDeathYear(rs.getInt("authors.death_year"));
        return author;
    }

}
