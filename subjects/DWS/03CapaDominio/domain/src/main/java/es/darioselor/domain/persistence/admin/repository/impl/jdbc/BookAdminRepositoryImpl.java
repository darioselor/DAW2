package es.darioselor.domain.persistence.admin.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.darioselor.domain.domain.admin.model.Book;
import es.darioselor.domain.domain.admin.repository.AuthorAdminRepository;
import es.darioselor.domain.domain.admin.repository.BookAdminRepository;
import es.darioselor.domain.domain.admin.repository.GenreAdminRepository;
import es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers.BookRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookAdminRepositoryImpl implements BookAdminRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorAdminRepository authorAdminRepository;
    private final GenreAdminRepository genreUserRepository;

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
            book.setAuthors(authorAdminRepository.findAuthorsByBookIsbn(isbn));
            book.setGenres(genreUserRepository.findGenresByBookIsbn(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Book> findById(Long id) {
        String sql = """
                     SELECT * FROM books
                     LEFT JOIN categories ON books.category_id = categories.id
                     LEFT JOIN publishers ON books.publisher_id = publishers.id
                     WHERE books.id = ?
                """;
        try {
            Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
            book.setAuthors(authorAdminRepository.findAuthorsByBookId(id));
            book.setGenres(genreUserRepository.findGenresByBookId(id));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();

        }
    }

    @Override
    public void save(Book book) {
        if (book.getId() != null) {
            update(book);
        } else {
            Long id = insert(book);
            book.setId(id);
        }
        this.deleteAuthors(book.getId());
        this.instertAuthros(book.getId(), book.getAuthors());
        this.deleteGenres(book.getId());
        this.insertGenres(book.getId(), book.getGenres());
    }

    private void update(Book book){
        String sql = """
                UPDATE books
                SET isbn = ?,
                    title_es = ?,
                    title_en = ?,
                    synopsis_es = ?,
                    synopsis_en = ?,
                    price = ?,
                    discount = ?,
                    cover = ?,
                    publisher_id = ?,
                    category_id = ?
                WHERE id = ?
            """;
        jdbcTemplate.update(
                sql,
                book.getIsbn(),
                book.getTitleEs(),
                book.getTitleEn(),
                book.getSynopsisEs(),
                book.getSynopsisEn(),
                book.getPrice(),
                book.getDiscount(),
                book.getCover(),
                book.getPublisher().getId(),
                book.getCategory().getId(),
                book.getId()
        );
    }

}