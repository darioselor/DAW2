package es.darioselor.domain.controller.user.webModel.Book;

public record BookCollection(
        String isbn,
        String title,
        float price,
        float discount,
        String cover
) {
}
