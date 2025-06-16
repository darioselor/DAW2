package darioselor.jpaFinalLayer.persistence.repository.impl;

import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.domain._4repository.GenreRepository;
import darioselor.jpaFinalLayer.persistence.dao.db.GenreDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GenreRepositoryImpl implements GenreRepository {

    private final GenreDaoDb genreDaoDb;

    @Override
    public List<Genre> findAllGenresByBookId(long id) {
        return genreDaoDb.findAllGenresByBookId(id);
    }

    @Override
    public List<Genre> findAllGenresByBookIsbn(String isbn) {
        return genreDaoDb.findAllGenresByBookIsbn(isbn);
    }

    @Override
    public List<Genre> findAllById(List<Genre> genres) {
        return genreDaoDb.findAllById(genres);
    }
}
