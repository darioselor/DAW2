package com.example.demo.persistance.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Book;
import com.example.demo.domain.repository.BookRepository;
import com.example.demo.persistance.jpa.BookJpa;
import com.example.demo.persistance.jpa.mapper.BookMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookJpaRepositoryImpl implements BookRepository {

    private final BookJpa bookJpa;

    @Override
    public List<Book> findAll() {
        
        return BookMapper.INSTANCE.toBooks(bookJpa.findAll());

    }

    @Override
    public Optional<Book> findById(Integer id) {
        
        return bookJpa.findById(id).map(BookMapper.INSTANCE::toBook);
    }
    
}
