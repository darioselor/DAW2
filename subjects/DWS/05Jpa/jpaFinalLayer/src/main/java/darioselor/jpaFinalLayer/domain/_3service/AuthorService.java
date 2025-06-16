package darioselor.jpaFinalLayer.domain._3service;

import darioselor.jpaFinalLayer.domain._1model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAllAuthorsByBookId(Long id);


    List<Author> findAllById(List<Author> authors);
}
