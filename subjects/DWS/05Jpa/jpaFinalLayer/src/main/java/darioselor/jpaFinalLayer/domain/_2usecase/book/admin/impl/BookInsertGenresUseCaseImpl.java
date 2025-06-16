package darioselor.jpaFinalLayer.domain._2usecase.book.admin.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookInsertGenresUseCase;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import darioselor.jpaFinalLayer.domain._3service.GenreService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainUseCase
@Transactional
@RequiredArgsConstructor
public class BookInsertGenresUseCaseImpl implements BookInsertGenresUseCase {
    private final BookService bookService;
    private final GenreService genreService;

    @Override
    public void execute(long id, List<Genre> genres) {
        Book book = bookService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book with id: "+id+" not found"));
        genreService.findAllById(genres)
                .forEach(genre -> bookService.addGenre(book,genre));
        bookService.save(book);
    }
}
