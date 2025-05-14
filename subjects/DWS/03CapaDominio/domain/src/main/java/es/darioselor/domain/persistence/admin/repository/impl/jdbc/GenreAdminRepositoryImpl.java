package es.darioselor.domain.persistence.admin.repository.impl.jdbc;

import es.darioselor.domain.domain.admin.model.Genre;
import es.darioselor.domain.persistence.admin.repository.GenreAdminRepository;
import es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers.GenreAdminRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GenreAdminRepositoryImpl implements GenreAdminRepository {
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Genre> findGenresByBookIsbn(String isbn) {
        String sql = """
                SELECT genres.* FROM genres
                JOIN books_genres ON genres.id = books_genres.genre_id
                JOIN books ON books_genres.book_id = books.id
                AND books.isbn = ?
           """;
        return jdbcTemplate.query(sql, new GenreAdminRowMapper(), isbn);
    }
}
