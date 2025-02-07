package fpmislata.examen.domain.usecase.order.user.model;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderUser {
    private Date orderDate;
    private Date deliveryDate;
    private String status;
    private float total;
    private UserUser userUser;
    private OrderDetailsUser orderDetailsUser;

    public OrderUser(Date orderDate, Date deliveryDate, String status, float total, UserUser userUser,
            OrderDetailsUser orderDetailsUser) {
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.total = total;
        this.userUser = userUser;
        this.orderDetailsUser = orderDetailsUser;
    }
}
