package fpmislata.examen.domain.service;

import java.util.Optional;

import fpmislata.examen.domain.model.Book;

public interface BookService {
    Optional<Book> getBookByID(Long id);
}
