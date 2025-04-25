package com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.darioselor.ArquitecturaPorCapas.domain.model.Genre;

public class GenreRowMapper implements RowMapper<Genre> {

    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        Genre genre = new Genre();
        genre.setId(rs.getInt("id"));
        genre.setName(rs.getString("name_es"));
        genre.setSlug(rs.getString("slug"));
        return genre;
    }
}