package darioselor.jpaFinalLayer.domain._4repository;

import darioselor.jpaFinalLayer.domain._1model.Genre;

import java.util.List;

public interface GenreRepository {
    List<Genre> findAllGenresByBookId(long id);
    List<Genre> findAllGenresByBookIsbn(String isbn);

    List<Genre> findAllById(Long[] ids);
}
