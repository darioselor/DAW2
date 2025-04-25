package com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.darioselor.ArquitecturaPorCapas.domain.model.Book;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.AuthorRepository;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.BookRepository;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.GenreRepository;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc.mapper.BookRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryJdbc implements BookRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

    @Override
    public List<Book> getAll() {
        String sql = """
                   SELECT * FROM books
                """;
        return jdbcTemplate.query(sql, new BookRowMapper());
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
            book.setAuthors(authorRepository.getByIsbnBook(isbn));
            book.setGenres(genreRepository.getByIsbnBook(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}