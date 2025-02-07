package fpmislata.examen.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory;

import fpmislata.examen.domain.model.Order;

public class OrderRowMapper implements CustomRowMapper<Order> {

    private final OrderDetailsRowMapper orderDetailsRowMapper = new OrderDetailsRowMapper();
    private final UserRowMapper userRowMapper = new UserRowMapper();

    @Override
    public Order mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getLong("orders.id"));
        order.setOrderDate(resultSet.getDate("orders.order_date"));
        order.setDeliveryDate(resultSet.getDate("orders.delivery_date"));
        order.setStatus(resultSet.getString("orders.status"));
        order.setTotal(resultSet.getFloat("orders.total"));

    }

}
