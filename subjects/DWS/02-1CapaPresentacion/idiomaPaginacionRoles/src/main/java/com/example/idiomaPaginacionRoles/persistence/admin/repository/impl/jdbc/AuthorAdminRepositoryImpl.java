package com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc;

import com.example.idiomaPaginacionRoles.domain.admin.model.Author;
import com.example.idiomaPaginacionRoles.persistence.admin.repository.AuthorAdminRepository;
import com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc.mappers.AuthorRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuthorAdminRepositoryImpl implements AuthorAdminRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Author> findAuthorByBookIsbn(String isbn) {
        String sql = """
                SELECT authors.* FROM authors
                JOIN books_authors ON authors.id = books_authors.author_id
                JOIN books ON books_authors.book_id = books.id
                AND books.isbn = ?
           """;
        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }
}
