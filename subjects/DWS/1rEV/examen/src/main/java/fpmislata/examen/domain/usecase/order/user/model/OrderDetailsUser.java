package fpmislata.examen.domain.usecase.order.user.model;

public class OrderDetailsUser {

    private int quantity;
    private float price;
    private BookUser book;

    public OrderDetailsUser(int quantity, float price, BookUser book) {
        this.quantity = quantity;
        this.price = price;
        this.book = book;
    }
}
