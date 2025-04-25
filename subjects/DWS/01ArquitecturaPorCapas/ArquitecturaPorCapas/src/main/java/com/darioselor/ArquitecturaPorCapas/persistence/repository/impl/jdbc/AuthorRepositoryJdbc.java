package com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.darioselor.ArquitecturaPorCapas.domain.model.Author;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.AuthorRepository;
import com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc.mapper.AuthorRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryJdbc implements AuthorRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        String sql = """
                    SELECT authors.* FROM authors
                    JOIN books_authors ON authors.id = books_authors.author_id
                    JOIN books ON books_authors.book_id = books.id
                    AND books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }
}
