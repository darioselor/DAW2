package darioselor.jpaFinalLayer.domain._2usecase.book.admin;

import darioselor.jpaFinalLayer.domain._1model.Author;

import java.util.List;

public interface BookInsertAuthorsUseCase {
    void execute(long id, List<Author> authors);
}
