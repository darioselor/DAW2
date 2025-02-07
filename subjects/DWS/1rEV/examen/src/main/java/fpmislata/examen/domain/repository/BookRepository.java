package fpmislata.examen.domain.repository;

import java.util.Optional;

import fpmislata.examen.domain.model.Book;

public interface BookRepository {
    Optional<Book> getBookByID(Long id);
}
