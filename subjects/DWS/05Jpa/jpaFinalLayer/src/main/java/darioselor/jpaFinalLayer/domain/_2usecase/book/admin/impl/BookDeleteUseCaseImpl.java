package darioselor.jpaFinalLayer.domain._2usecase.book.admin.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookDeleteUseCase;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import darioselor.jpaFinalLayer.domain._4repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@Transactional
@RequiredArgsConstructor
public class BookDeleteUseCaseImpl implements BookDeleteUseCase {

    private final BookService bookService;

    @Override
    public void execute(long id) {
        bookService.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book with id: " + id + " not found"));
        bookService.delete(id);
    }
}
