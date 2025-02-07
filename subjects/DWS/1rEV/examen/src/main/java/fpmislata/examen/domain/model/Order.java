package fpmislata.examen.domain.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    private Long id;
    private Date orderDate;
    private Date deliveryDate;
    private String status;
    private float total;
    private User user;
    private OrderDetails orderDetails;

}
