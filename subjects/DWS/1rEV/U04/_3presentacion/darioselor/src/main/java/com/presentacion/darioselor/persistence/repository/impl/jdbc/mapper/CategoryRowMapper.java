package com.presentacion.darioselor.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.presentacion.darioselor.domain.model.Category;

public class CategoryRowMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

        Category category = new Category();
        category.setId(rs.getInt("id"));
        category.setName(rs.getString("name_es"));
        category.setSlug(rs.getString("slug"));
        return category;
    }
}
