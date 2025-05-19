package es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers;

import es.darioselor.common.locale.LanguageUtils;
import es.darioselor.domain.domain.admin.model.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreRowMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Genre genre = new Genre();
        genre.setId(resultSet.getLong("genres.id"));
        genre.setNameEs(resultSet.getString("genres.name_es"));
        genre.setNameEn(resultSet.getString("genres.name_en"));
        genre.setSlug(resultSet.getString("genres.slug"));
        return genre;
    }
}
