package com.example.demo.persistance.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Author;
import com.example.demo.domain.repository.AuthorRepository;
import com.example.demo.persistance.jpa.AuthorJpa;
import com.example.demo.persistance.jpa.mapper.AuthorMapper;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class AuthorJpaRepositoryImpl implements AuthorRepository{

    private final AuthorJpa authorJpa;
    @Override
    public List<Author> findAll() {
        
        return AuthorMapper.INSTANCE.toAuthors(authorJpa.findAll());

    }

    @Override
    public Optional<Author> findById(Integer id) {
       
        return authorJpa.findById(id).map(AuthorMapper.INSTANCE::toAuthor);
    }

    @Override
    public void save(Author author) {
        authorJpa.save(AuthorMapper.INSTANCE.toAuthorEntity(author));
    }

    @Override
    public List<Author> findAllByBookId(Integer bookId) {
        
        return AuthorMapper.INSTANCE.toAuthors(authorJpa.findAllByBookId(bookId));
    }
    
}
