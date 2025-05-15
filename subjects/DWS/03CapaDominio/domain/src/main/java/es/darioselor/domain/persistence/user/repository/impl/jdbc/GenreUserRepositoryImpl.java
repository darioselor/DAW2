package es.darioselor.domain.persistence.user.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.darioselor.domain.domain.user.model.Genre;
import es.darioselor.domain.domain.user.repository.GenreUserRepository;
import es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers.GenreRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GenreUserRepositoryImpl implements GenreUserRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Genre> findGenresByBookIsbn(String isbn) {
        String sql = """
                    SELECT genres.* FROM genres
                    JOIN books_genres ON genres.id = books_genres.genre_id
                    JOIN books ON books_genres.book_id = books.id
                    AND books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new GenreRowMapper(), isbn);
    }
}
