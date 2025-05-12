package es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers;

import es.darioselor.domain.controller.common.locale.LanguageUtils;
import es.darioselor.domain.domain.user.model.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreRowMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Genre genre = new Genre();
        genre.setId(rs.getLong("genres.id"));
        genre.setName(rs.getString("genre.name_"+language));
        genre.setSlug(rs.getString("genre.slug"));
        return genre;

    }
}
