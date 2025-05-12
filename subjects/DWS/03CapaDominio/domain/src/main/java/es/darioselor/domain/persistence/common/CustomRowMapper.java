package es.darioselor.domain.persistence.common;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CustomRowMapper<Object> extends RowMapper<Object> {
    default boolean existsColumn(ResultSet rs, String columnName) {
        try {
            rs.findColumn(columnName);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
