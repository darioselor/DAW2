package com.example.presentationLayer.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String isbn;
    private String title;
    private String synopsis;
    private float price;
    private float discount;
    private String cover;
    private Publisher publisher;
    private Category category;
    private List<Author> authors;
    private List<Genre> genres;
}
