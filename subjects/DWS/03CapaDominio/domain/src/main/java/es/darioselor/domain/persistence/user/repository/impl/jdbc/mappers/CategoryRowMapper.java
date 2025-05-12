package es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers;

import es.darioselor.domain.controller.common.locale.LanguageUtils;
import es.darioselor.domain.domain.user.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {
    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Category category = new Category();
        category.setId(rs.getLong("categories.id"));
        category.setName(rs.getString("categories.name_"+language));
        category.setSlug(rs.getString("categories.slug"));
        return category;
    }
}
