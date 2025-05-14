package es.darioselor.domain.persistence.admin.repository.impl.jdbc;

import es.darioselor.domain.domain.admin.model.Author;
import es.darioselor.domain.persistence.admin.repository.AuthorAdminRepository;
import es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers.AuthorAdminRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuthorAdminRepositoryImpl implements AuthorAdminRepository {

    private final JdbcTemplate jdbcTemplate;
    @Override
    public List<Author> findAuthorsByBookIsbn(String isbn) {
        String sql = """
                SELECT authors.* FROM authors
                JOIN books_authors ON authors.id = books_authors.author_id
                JOIN books ON books_authors.book_id = books.id
                AND books.isbn = ?
           """;
        return jdbcTemplate.query(sql, new AuthorAdminRowMapper(), isbn);
    }
}
