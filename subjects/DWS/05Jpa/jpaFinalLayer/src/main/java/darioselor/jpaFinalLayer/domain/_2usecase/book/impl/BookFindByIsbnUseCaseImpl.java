package darioselor.jpaFinalLayer.domain._2usecase.book.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainTransactional;
import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookFindByIsbnUseCase;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class BookFindByIsbnUseCaseImpl implements BookFindByIsbnUseCase {
    private final BookService bookService;

    @Override
    public Book execute(String isbn) {
        return bookService.findByIsbn(isbn)
                .orElseThrow(() -> new ResourceNotFoundException("Book with isbn: "+ isbn +" not found."));
    }
}
