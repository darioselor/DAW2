package darioselor.jpaFinalLayer.domain._3service;

import darioselor.jpaFinalLayer.domain._1model.Genre;

import java.util.List;

public interface GenreService {

    List<Genre> findByBookId(Long bookId);

    List<Genre> findAllById(List<Genre> genres);
}
