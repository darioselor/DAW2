package com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.idiomaPaginacionRoles.domain.user.model.Genre;
import com.example.idiomaPaginacionRoles.persistence.user.repository.GenreUserRepository;
import com.example.idiomaPaginacionRoles.persistence.user.repository.impl.jdbc.mappers.GenreRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GenreRepositoryImplJdbc implements GenreUserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Genre> findGenresByBookIsbn(String isbn) {
        String sql = """
                    SELECT * FROM genres
                    JOIN books_genres ON genres.id = books_genres.genre_id
                    JOIN books ON books_genres.book_id = books.id
                    WHERE books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new GenreRowMapper(), isbn);
    }

}