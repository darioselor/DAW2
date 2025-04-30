package com.example.capaPresentacion.domain.model;

import java.util.List;

public class Book {

    private String isbn;
    private String name;
    private String synopsis;
    private float price;
    private float discount;
    private List<Author> authors;
    private List<Publisher> publishers;
}
