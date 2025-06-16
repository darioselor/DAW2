package com.example.presentationLayer.persistence.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.presentationLayer.domain.model.Book;
import com.example.presentationLayer.persistence.repository.AuthorRepository;
import com.example.presentationLayer.persistence.repository.BookRepository;
import com.example.presentationLayer.persistence.repository.GenreRepository;
import com.example.presentationLayer.persistence.repository.impl.jdbc.mappers.BookRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryJdbc implements BookRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

    @Override
    public List<Book> findAll() {
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
            book.setAuthors(authorRepository.findByBookIsbn(isbn));
            book.setGenres(genreRepository.findByBookIsbn(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            System.out.println("Error al mapear Book con ISBN {}: " + isbn + e);
            return Optional.empty();
        }
    }

}
