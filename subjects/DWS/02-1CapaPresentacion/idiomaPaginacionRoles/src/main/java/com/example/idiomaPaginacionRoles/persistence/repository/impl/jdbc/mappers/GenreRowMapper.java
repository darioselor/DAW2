package com.example.idiomaPaginacionRoles.persistence.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.idiomaPaginacionRoles.domain.model.Genre;

public class GenreRowMapper implements RowMapper<Genre> {

    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        Genre genre = new Genre();
        genre.setId(rs.getLong("genres.id"));
        genre.setName(rs.getString("genres.name"));
        genre.setSlug(rs.getString("genres.slug"));
        return genre;
    }

}
