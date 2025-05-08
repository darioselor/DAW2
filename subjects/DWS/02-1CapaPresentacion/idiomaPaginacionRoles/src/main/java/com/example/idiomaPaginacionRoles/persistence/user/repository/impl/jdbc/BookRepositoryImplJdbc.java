package com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.idiomaPaginacionRoles.domain.user.model.Book;
import com.example.idiomaPaginacionRoles.persistence.user.repository.AuthorRepository;
import com.example.idiomaPaginacionRoles.persistence.user.repository.BookRepository;
import com.example.idiomaPaginacionRoles.persistence.user.repository.GenreRepository;
import com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc.mappers.BookRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImplJdbc implements BookRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

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
        return  jdbcTemplate.queryForObject(sql, Integer.class);
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
            book.setAuthors(authorRepository.findAuthorsByBookIsbn(isbn));
            book.setGenres(genreRepository.findGenresByBookIsbn(isbn));
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
