package com.example.presentationLayer.controller.webModel.Book;

import java.util.List;

import com.example.presentationLayer.controller.webModel.Author.AuthorCollection;
import com.example.presentationLayer.controller.webModel.Publisher.PublisherCollection;
import com.fasterxml.jackson.annotation.JsonProperty;

public record BookDetail(
        String isbn,
        String title,
        float price,
        float discount,
        String synopsis,
        String cover,
        List<String> genres,
        String category,
        @JsonProperty("publisher") PublisherCollection publisherCollection,
        @JsonProperty("author") AuthorCollection authorCollection

) {

}
