package com.example.idiomaPaginacionRoles.persistence.repository.impl.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.idiomaPaginacionRoles.controller.locale.LanguageUtils;
import com.example.idiomaPaginacionRoles.domain.model.Category;

public class CategoryRowMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Category category = new Category();
        category.setId(rs.getLong("categories.id"));
        category.setName(rs.getString("categories.name_" + language));
        category.setSlug(rs.getString("categories.slug"));
        return category;
    }

}
