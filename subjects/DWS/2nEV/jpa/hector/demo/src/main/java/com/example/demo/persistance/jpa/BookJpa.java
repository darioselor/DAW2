package com.example.demo.persistance.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.jpa.entity.BookEntity;

public interface BookJpa extends JpaRepository<BookEntity, Integer>{
    
}
