package com.example.demo.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Author;
import com.example.demo.domain.repository.AuthorRepository;
import com.example.demo.domain.service.AuthorService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Integer id) {
        return authorRepository.findById(id);
    }


    @Override
    public void create(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void update(Author author) {
        authorRepository.save(author);
    }

    @Override
    public List<Author> findAllByBookId(Integer bookId) {
        return authorRepository.findAllByBookId(bookId);
    }
    
}
