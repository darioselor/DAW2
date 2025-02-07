package com.example.demo.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int id;
    private String titleEs;
    private String titleEn;
    private String isbn;
    private String synopsisEs;
    private String synopsisEn;
    private String cover;
    private Float discount;
    private Category category;
    private Publisher publisher;
    private List<Author> authors;
    private List<Genre> genres;
    
}
