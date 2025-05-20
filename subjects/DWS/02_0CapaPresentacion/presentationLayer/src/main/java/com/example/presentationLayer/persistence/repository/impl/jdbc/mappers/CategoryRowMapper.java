package com.example.presentationLayer.persistence.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.presentationLayer.domain.model.Category;

public class CategoryRowMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();
        category.setId(rs.getLong("categories.id"));
        category.setName(rs.getString("categories.name_es"));
        category.setSlug(rs.getString("categories.slug"));
        return category;
    }
}
