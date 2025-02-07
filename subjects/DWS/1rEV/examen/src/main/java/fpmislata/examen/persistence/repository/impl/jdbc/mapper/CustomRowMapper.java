package fpmislata.examen.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fpmislata.examen.common.locale.LanguageUtils;

public class CustomRowMapper<T> extends RowMapper<T> {

    default boolean existsColumn(ResultSet rs, String columnName) {
        try {
            rs.findColumn(columnName)
        } catch (SQLException e) {
            return false;
        }
    }

    default String getLanguage() {
        return LanguageUtils.getCurrentLanguage();
    }

}
