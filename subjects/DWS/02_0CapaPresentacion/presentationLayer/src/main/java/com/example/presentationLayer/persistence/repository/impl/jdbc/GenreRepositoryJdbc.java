package com.example.presentationLayer.persistence.repository.impl.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.presentationLayer.domain.model.Genre;
import com.example.presentationLayer.persistence.repository.GenreRepository;
import com.example.presentationLayer.persistence.repository.impl.jdbc.mappers.GenreRowMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GenreRepositoryJdbc implements GenreRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Genre> findByBookIsbn(String isbn) {
        String sql = """
                    SELECT genres.* FROM genres
                    JOIN books_genres ON genres.id = books_genres.genre_id
                    JOIN books ON books_genres.book_id = books.id
                    AND books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new GenreRowMapper(), isbn);
    }

}
