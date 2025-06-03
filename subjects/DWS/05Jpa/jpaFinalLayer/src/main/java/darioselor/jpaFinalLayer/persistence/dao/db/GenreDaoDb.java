package darioselor.jpaFinalLayer.persistence.dao.db;

import darioselor.jpaFinalLayer.domain._1model.Genre;

import java.util.List;

public interface GenreDaoDb extends GenericDaoDb<Genre> {
    List<Genre> findAllGenresByBookId(long id);
    List<Genre> findAllGenresByBookIsbn(String isbn);
    List<Genre> findAllById(Long[] ids);

}
