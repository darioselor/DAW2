package darioselor.jpaFinalLayer.controller.user.webmodel.book;

public record BookCollection(
        String isbn,
        String title,
        float price,
        float discount,
        String cover
) {
}
