package darioselor.jpaFinalLayer.domain._4repository;

import darioselor.jpaFinalLayer.domain._1model.Author;

import java.util.List;

public interface AuthorRepository {
    List<Author> findAllAuthorsByBookId(long id);
    List<Author> findAllAuthorsByBookIsbn(String isbn);
    List<Author> findAllById(Long[] ids);
}
