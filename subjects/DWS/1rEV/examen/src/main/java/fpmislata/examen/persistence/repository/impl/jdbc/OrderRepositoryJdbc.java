package fpmislata.examen.persistence.repository.impl.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fpmislata.examen.domain.model.Order;
import fpmislata.examen.domain.repository.OrderDetailsRepository;
import fpmislata.examen.domain.repository.OrderRepository;
import fpmislata.examen.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor

public class OrderRepositoryJdbc implements OrderRepository {

    private final JdbcTemplate jdbcTemplate;

    private final OrderDetailsRepository orderDetailRepository;
    private final UserRepository userRepository;

    @Override
    public List<Order> getAll() {
        String sql = """
                SELECT * FROM orders
                """;
        return jdbcTemplate.query(sql, new OrderRowMapper());
    }

    @Override
    public List<Order> getAll(int page, int size) {
        String sql = """
                SELECT * FROM orders
                LIMIT ? OFFSET ?
                """;
        return jdbcTemplate.query(sql, new OrderRowMapper(), size, page * size);
    }

    @Override
    public int count() {
        String sql = """
                SELECT COUNT(*) FROM orders
                """;
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Optional<Order> getById(Long id) {
        String sql = """
                SELECT * FROM orders
                LEFT JOIN users ON orders.user_id = users.id
                LEFT JOIN order_details ON orders.id = order_details.order_id
                """;
        try {
            Order order = jdbcTemplate.queryForObject(sql, new OrderRowMapper(), id);
            return Optional.of(order);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

}
