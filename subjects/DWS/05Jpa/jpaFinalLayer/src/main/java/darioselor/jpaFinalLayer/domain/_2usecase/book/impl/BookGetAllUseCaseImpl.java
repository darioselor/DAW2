package darioselor.jpaFinalLayer.domain._2usecase.book.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookGetAllUseCase;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@Transactional
@RequiredArgsConstructor
public class BookGetAllUseCaseImpl implements BookGetAllUseCase {
    private final BookService bookService;


    @Override
    public ListWithCount<Book> execute(int page, int pageSize) {
        return bookService.findAll(page, pageSize);
    }
}
