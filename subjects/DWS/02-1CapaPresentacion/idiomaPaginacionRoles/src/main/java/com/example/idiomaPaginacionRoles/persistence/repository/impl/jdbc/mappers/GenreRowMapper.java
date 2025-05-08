package com.example.idiomaPaginacionRoles.persistence.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.idiomaPaginacionRoles.controller.locale.LanguageUtils;
import org.springframework.jdbc.core.RowMapper;

import com.example.idiomaPaginacionRoles.domain.model.Genre;

public class GenreRowMapper implements RowMapper<Genre> {

    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Genre genre = new Genre();
        genre.setId(rs.getLong("genres.id"));
        genre.setName(rs.getString("genres.name_" + language));
        genre.setSlug(rs.getString("genres.slug"));
        return genre;
    }

}
