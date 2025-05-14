package es.darioselor.domain.persistence.admin.repository.impl.jdbc;

import es.darioselor.domain.domain.admin.model.Book;
import es.darioselor.domain.persistence.admin.repository.AuthorAdminRepository;
import es.darioselor.domain.persistence.admin.repository.BookAdminRepository;
import es.darioselor.domain.persistence.admin.repository.GenreAdminRepository;
import es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers.BookAdminRowMapper;
import es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers.BookRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BookAdminRepositoryImpl implements BookAdminRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorAdminRepository authorAdminRepository;
    private final GenreAdminRepository genreAdminRepository;

    @Override
    public List<Book> findAll() {
        String sql = """
                SELECT * FROM books
                """;
        return jdbcTemplate.query(sql, new BookAdminRowMapper());
    }

    @Override
    public List<Book> findAll(int page, int pageSize) {
        String sql = """
                SELECT * FROM books
                LIMIT ? OFFSET ?
                """;
        return jdbcTemplate.query(sql, new BookAdminRowMapper(), pageSize, page*pageSize);
    }

    @Override
    public int count() {
        String sql = """
                SELECT COUNT(*) FROM books
                """;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn){
        String sql = """
                SELECT * FROM books
                LEFT JOIN categories ON books.category_id = categories.id
                LEFT JOIN publishers ON books.publisher_id = publishers.id
                WHERE books.isbn = ?
                """;
        try {
            Book book = jdbcTemplate.queryForObject(sql, new BookAdminRowMapper(), isbn);
            book.setAuthors(authorAdminRepository.findAuthorsByBookIsbn(isbn));
            book.setGenres(genreAdminRepository.findGenresByBookIsbn(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
