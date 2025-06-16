package darioselor.jpaFinalLayer.controller.user.webmodel.book;

import darioselor.jpaFinalLayer.controller.user.webmodel.author.AuthorCollection;
import darioselor.jpaFinalLayer.controller.user.webmodel.publisher.PublisherCollection;

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
