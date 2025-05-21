package darioselor.domainLayer.persistence.repository.impl.jdbc.mappers;

import darioselor.domainLayer.domain.model.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getLong("authors.id"));
        author.setName(rs.getString("authors.name"));
        author.setBiographyEs(rs.getString("authors.biography_es"));
        author.setBiographyEn(rs.getString("authors.biography_en"));
        author.setBirthYear(rs.getInt("authors.birth_year"));
        author.setDeathYear(rs.getInt("authors.death_year"));
        author.setNationality(rs.getString("authors.nationality"));
        return author;
    }
}
