package com.example.demo.persistance.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.persistance.jpa.entity.AuthorEntity;

public interface AuthorJpa extends JpaRepository<AuthorEntity, Integer> {

     @Query(value = "SELECT a.* FROM authors a " +
            "INNER JOIN books_authors ba ON a.id = ba.author_id " +
            "WHERE ba.book_id = :bookId", nativeQuery = true)
    List<AuthorEntity> findAllByBookId(@Param("bookId") Integer bookId);


    
    
}
