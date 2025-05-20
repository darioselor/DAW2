package com.example.idiomaPaginacionRoles.controller.user.webModel.Book;

import java.util.List;

import com.example.idiomaPaginacionRoles.controller.user.webModel.Author.AuthorCollection;
import com.example.idiomaPaginacionRoles.controller.user.webModel.Publisher.PublisherCollection;
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
        @JsonProperty("author") AuthorCollection authorCollection) {
}
