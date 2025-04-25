package com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.darioselor.ArquitecturaPorCapas.domain.model.Category;

public class CategoryRowMapper implements CustomRowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();
        category.setId(rs.getInt("categories.id"));
        category.setName(rs.getString("categories.name_es"));
        category.setSlug(rs.getString("categories.slug"));
        return category;
    }
}