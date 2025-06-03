package darioselor.jpaFinalLayer.domain._3service.impl;

import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._3service.AuthorService;
import darioselor.jpaFinalLayer.domain._4repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAllAuthorsByBookId(Long id) {
        return authorRepository.findAllAuthorsByBookId(id);
    }

    @Override
    public List<Author> findAllById(List<Author> authors) {
        List<Author> foundAuthors = authorRepository.findAllById(
                authors
                        .stream()
                        .map(Author::getId)
                        .toArray()
        );
        if (foundAuthors.size() != authors.size()) {
            throw new ResourceNotFoundException("Some authors were not found");
        }
        return foundAuthors;
    }
}
