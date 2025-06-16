package es.darioselor.domain.controller.user.book;


public record BookCollection(String isbn,
                             String title,
                             float price,
                             float discount,
                             String cover) {
}
