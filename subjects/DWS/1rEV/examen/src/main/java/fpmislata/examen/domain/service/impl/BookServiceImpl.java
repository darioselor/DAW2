package fpmislata.examen.domain.service.impl;

import java.util.Optional;

import fpmislata.examen.common.annotation.DomainService;
import fpmislata.examen.domain.model.Book;
import fpmislata.examen.domain.repository.BookRepository;
import fpmislata.examen.domain.service.BookService;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Optional<Book> getBookByID(Long id) {
        return bookRepository.getBookByID(id);
    }

}
