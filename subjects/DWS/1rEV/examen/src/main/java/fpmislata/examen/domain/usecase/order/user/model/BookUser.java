package fpmislata.examen.domain.usecase.order.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookUser {

    private String isbn;
    private String title;

    public BookUser(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

}
