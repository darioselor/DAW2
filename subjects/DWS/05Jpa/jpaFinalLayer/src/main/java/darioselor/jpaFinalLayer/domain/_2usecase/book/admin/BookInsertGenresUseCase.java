package darioselor.jpaFinalLayer.domain._2usecase.book.admin;

import darioselor.jpaFinalLayer.domain._1model.Genre;

import java.util.List;

public interface BookInsertGenresUseCase {
    void execute(long id, List<Genre> genres);
}
