package es.darioselor.domain.controller.admin.webModel.Book;

import com.fasterxml.jackson.annotation.JsonProperty;
import es.darioselor.domain.controller.admin.webModel.Author.AuthorCollection;
import es.darioselor.domain.controller.admin.webModel.Publisher.PublisherCollection;

import java.util.List;

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
