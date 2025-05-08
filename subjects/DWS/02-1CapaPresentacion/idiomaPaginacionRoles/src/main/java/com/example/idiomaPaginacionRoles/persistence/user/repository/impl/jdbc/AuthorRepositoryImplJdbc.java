package com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.idiomaPaginacionRoles.domain.user.model.Author;
import com.example.idiomaPaginacionRoles.persistence.user.repository.AuthorRepository;
import com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc.mappers.AuthorRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryImplJdbc implements AuthorRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Author> findAuthorsByBookIsbn(String isbn) {
        String sql = """
                SELECT authors.* FROM authors
                JOIN books_authors ON authors.id = books_authors.author_id
                JOIN books ON books_authors.book_id = books.id
                AND books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }

}
