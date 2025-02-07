package fpmislata.examen.persistence.repository.impl.jdbc;

import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fpmislata.examen.domain.model.Book;
import fpmislata.examen.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryJdbc implements BookRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Optional<Book> getBookByID(Long id) {
        String sql = """
                SELECT * FROM books
                WHERE id = ?
                """;
        try {
            return Optional.of(jdbcTemplate.queryForObject(sql, new BookRowMapper(), id));
        } catch (Exception e) {
            return Optional.empty();
        }

    }

}
