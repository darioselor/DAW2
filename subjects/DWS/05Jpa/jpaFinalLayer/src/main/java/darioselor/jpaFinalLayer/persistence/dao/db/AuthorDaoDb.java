package darioselor.jpaFinalLayer.persistence.dao.db;

import darioselor.jpaFinalLayer.domain._1model.Author;

import java.util.List;

public interface AuthorDaoDb extends GenericDaoDb<Author> {

    List<Author> findAllAuthorsByBookIsbn(String isbn);
    List<Author> findAllAuthorsByBookId(long id);
    List<Author> findAllById(Long[] ids);
}
