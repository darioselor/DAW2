package darioselor.jpaFinalLayer.domain._2usecase.book;

import darioselor.jpaFinalLayer.domain._1model.Book;

public interface BookFindByIsbnUseCase {
    Book execute(String isbn);
}
