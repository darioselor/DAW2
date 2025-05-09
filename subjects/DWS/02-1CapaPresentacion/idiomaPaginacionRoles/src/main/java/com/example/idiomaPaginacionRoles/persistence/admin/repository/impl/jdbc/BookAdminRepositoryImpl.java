package com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc;

import com.example.idiomaPaginacionRoles.domain.admin.model.Book;
import com.example.idiomaPaginacionRoles.persistence.admin.repository.AuthorAdminRepository;
import com.example.idiomaPaginacionRoles.persistence.admin.repository.BookAdminRepository;
import com.example.idiomaPaginacionRoles.persistence.admin.repository.GenreAdminRepository;
import com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc.mappers.BookRowMapper;
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
    public List<Book> findAll(){
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
        return jdbcTemplate.query(sql, new BookRowMapper(),size, page * size);
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
            Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), isbn);
            book.setAuthors(authorAdminRepository.findAuthorByBookIsbn(isbn));
            book.setGenres(genreAdminRepository.findGenreByBookIsbn(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }


}
