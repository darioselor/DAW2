package darioselor.jpaFinalLayer.domain._2usecase.book.admin.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookInsertAuthorsUseCase;
import darioselor.jpaFinalLayer.domain._3service.AuthorService;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainUseCase
@Transactional
@RequiredArgsConstructor
public class BookInsertAuthorsUseCaseImpl implements BookInsertAuthorsUseCase {
    private final BookService bookService;
    private final AuthorService authorService;

    @Override
    public void execute(long id, List<Author> authors) {
        Book book = bookService.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Book with id: "+id+" not found."));
        authorService.findAllById(authors)
                .forEach(author -> bookService.addAuthor(book, author));
        bookService.save(book);
    }
}
