package darioselor.jpaFinalLayer.domain._2usecase.book;

import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;

public interface BookGetAllUseCase {
    ListWithCount<Book> execute(int page, int pageSize);
}
