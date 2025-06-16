package es.darioselor.domain.controller.user.book;

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
        PublisherCollection publisher,
        List<AuthorCollection> authors
) {
}
