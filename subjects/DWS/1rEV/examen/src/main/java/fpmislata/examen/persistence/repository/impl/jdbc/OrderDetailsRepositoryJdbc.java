package fpmislata.examen.persistence.repository.impl.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fpmislata.examen.domain.model.OrderDetails;
import fpmislata.examen.domain.repository.OrderDetailsRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class OrderDetailsRepositoryJdbc implements OrderDetailsRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public OrderDetails getOrderDetailsByOrderID(Long idOrder) {
        String sql = """
                SELECT order_details.* FROM order_details
                JOIN orders ON order_details.order_id = orders.id
                AND orders.id = ?
                """;
        return jdbcTemplate.query(sql, new OrderDetailsRowMapper(), idOrder);
    }

}
