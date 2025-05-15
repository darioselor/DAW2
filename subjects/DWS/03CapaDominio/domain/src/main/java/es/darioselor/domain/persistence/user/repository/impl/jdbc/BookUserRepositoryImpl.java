package es.darioselor.domain.persistence.user.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.darioselor.domain.domain.user.model.Book;
import es.darioselor.domain.domain.user.repository.AuthorUserRepository;
import es.darioselor.domain.domain.user.repository.BookUserRepository;
import es.darioselor.domain.domain.user.repository.GenreUserRepository;
import es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers.BookRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookUserRepositoryImpl implements BookUserRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorUserRepository authorUserRepository;
    private final GenreUserRepository genreUserRepository;

    @Override
    public List<Book> findAll() {
        String sql = """
                SELECT * FROM books
                """;
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    @Override
    public List<Book> findAll(int page, int size) {
        String sql = """
                SELECT * FROM books
                LIMIT ? OFFSET ?
                """;
        return jdbcTemplate.query(sql, new BookRowMapper(), size, page * size);
    }

    @Override
    public int count() {
        String sql = """
                SELECT COUNT(*) FROM books
                """;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        String sql = """
                    SELECT * FROM books
                    LEFT JOIN categories ON books.category_id = categories.id
                    LEFT JOIN publishers ON books.publisher_id = publishers.id
                    WHERE books.isbn = ?
                """;
        try {
            Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), isbn);
            book.setAuthors(authorUserRepository.findAuthorsByBookIsbn(isbn));
            book.setGenres(genreUserRepository.findGenresByBookIsbn(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
