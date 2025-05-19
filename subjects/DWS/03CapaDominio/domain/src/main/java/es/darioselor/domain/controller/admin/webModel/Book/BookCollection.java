package es.darioselor.domain.controller.admin.webModel.Book;

public record BookCollection(
        String isbn,
        String title,
        float price,
        float discount,
        String cover
) {
}
