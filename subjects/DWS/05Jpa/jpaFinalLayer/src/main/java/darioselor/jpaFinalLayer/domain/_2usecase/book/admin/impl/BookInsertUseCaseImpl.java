package darioselor.jpaFinalLayer.domain._2usecase.book.admin.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.common.exception.ResourceAlreadyExistsException;
import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookInsertUseCase;
import darioselor.jpaFinalLayer.domain._3service.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@Transactional
@RequiredArgsConstructor
public class BookInsertUseCaseImpl implements BookInsertUseCase {

    private final BookService bookService;
    private final AuthorService authorService;
    private final CategoryService categoryService;
    private final GenreService genreService;
    private final PublisherService publisherService;

    @Override
    public void execute(Book book) {
        if (bookService.findById(book.getId()).isPresent()) {
            throw new ResourceAlreadyExistsException("Book with id: " + book.getId() + " already exists.");
        }
        book.setPublisher(publisherService
                .findById(book.getPublisher().getId())
                .orElseThrow(()-> new ResourceNotFoundException("Publisher "+book.getPublisher().getName()+ " not found.")));
        book.setCategory(categoryService
                .findById(book.getCategory().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Category "+book.getCategory().getNameEs() + " not found.")));
        book.setGenres(genreService
                .findAllById(book.getGenres()));
        book.setAuthors(authorService
                .findAllById(book.getAuthors()));
        bookService.save(book);
    }
}
