package es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers;

import es.darioselor.common.locale.LanguageUtils;
import es.darioselor.domain.domain.user.model.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreRowMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Genre genre = new Genre();
        genre.setId(resultSet.getLong("genres.id"));
        genre.setName(resultSet.getString("genres.name_" + language));
        genre.setSlug(resultSet.getString("genres.slug"));
        return genre;
    }
}
