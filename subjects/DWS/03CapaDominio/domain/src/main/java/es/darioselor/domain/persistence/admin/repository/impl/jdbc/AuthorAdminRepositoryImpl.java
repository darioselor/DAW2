package es.darioselor.domain.persistence.admin.repository.impl.jdbc;

import es.darioselor.domain.domain.admin.model.Author;
import es.darioselor.domain.domain.admin.repository.AuthorAdminRepository;
import es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers.AuthorRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class AuthorAdminRepositoryImpl implements AuthorAdminRepository {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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
    @Override
    public List<Author> findAuthorsByBookId(Long id) {
        String sql = """
                SELECT authors.* FROM authors
                JOIN books_authors ON authors.id = books_authors.author_id
                JOIN books ON books_authors.book_id = books.id
                AND books.id = ?
           """;
        return jdbcTemplate.query(sql, new AuthorRowMapper(), id);

    }

    @Override
    public List<Author> findAllById(Long[] ids) {
        {
            String sql = """
                SELECT authors.* FROM authors
                WHERE id IN (:ids)
                """;
            Map<String, List<Long>> params = Map.of("ids", Arrays.asList(ids));
            return namedParameterJdbcTemplate.query(sql,params, new AuthorRowMapper());
        }
    }

}
