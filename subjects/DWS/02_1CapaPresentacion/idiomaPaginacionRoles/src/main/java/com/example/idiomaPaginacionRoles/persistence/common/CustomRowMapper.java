package com.example.idiomaPaginacionRoles.persistence.common;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

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
