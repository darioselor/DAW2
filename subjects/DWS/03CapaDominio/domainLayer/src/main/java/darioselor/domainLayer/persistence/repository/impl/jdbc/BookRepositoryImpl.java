package darioselor.domainLayer.persistence.repository.impl.jdbc;

import darioselor.domainLayer.domain.model.Book;
import darioselor.domainLayer.domain.repository.BookRepository;
import darioselor.domainLayer.persistence.repository.impl.jdbc.mappers.BookRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Book getBookById(Long id) {
        String sql = "SELECT * FROM books WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
    }

    @Override
    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

    private long insert(Book book) {
        String sql = """
                INSERT INTO books (
                isbn,
                title_es,
                title_en,
                synopsis_es,
                synopsis_en,
                price,
                discount,
                cover,
                publisher_id,
                category_id
                ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, new String[]{"id"});
            ps.setString(1, book.getIsbn());
            ps.setString(2, book.getTitleEs());
            ps.setString(3, book.getTitleEn());
            ps.setString(4, book.getSynopsisEs());
            ps.setString(5, book.getSynopsisEn());
            ps.setFloat(6, book.getPrice());
            ps.setFloat(7, book.getDiscount());
            ps.setString(8, book.getCover());
            ps.setLong(9, book.getPublisher().getId());
            ps.setLong(10, book.getCategory().getId());
            return ps;
            }, keyHolder);

        return keyHolder.getKey().longValue();
    }

    @Override
    public Book updateBook(Long id, Book book) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}
