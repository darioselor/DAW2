package es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers;

import es.darioselor.common.locale.LanguageUtils;
import es.darioselor.domain.domain.admin.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {
    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        String language = LanguageUtils.getCurrentLanguage();
        Category category = new Category();
        category.setId(rs.getLong("categories.id"));
        category.setNameEs(rs.getString("categories.name_es"));
        category.setNameEn(rs.getString("categories.name_en"));
        category.setSlug(rs.getString("categories.slug"));
        return category;
    }
}
