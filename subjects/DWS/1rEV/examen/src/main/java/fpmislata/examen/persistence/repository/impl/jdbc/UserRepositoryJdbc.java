package fpmislata.examen.persistence.repository.impl.jdbc;

import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fpmislata.examen.domain.model.User;
import fpmislata.examen.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepositoryJdbc implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Optional<User> getUserByAddress(String address) {
        String sql = """
                SELECT * FROM users
                WHERE address = ?
                """;
        try {
            return Optional.of(jdbcTemplate.queryForObject(sql, new UserRowMapper(), address));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

}
