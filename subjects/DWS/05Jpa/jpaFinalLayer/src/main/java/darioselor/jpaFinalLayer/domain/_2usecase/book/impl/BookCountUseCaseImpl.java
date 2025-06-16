package darioselor.jpaFinalLayer.domain._2usecase.book.impl;

import darioselor.jpaFinalLayer.common.annotation.DomainTransactional;
import darioselor.jpaFinalLayer.common.annotation.DomainUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookCountUseCase;
import darioselor.jpaFinalLayer.domain._3service.BookService;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class BookCountUseCaseImpl implements BookCountUseCase {
    private final BookService bookService;

    public long execute() {
        return bookService.count();
    }
}
