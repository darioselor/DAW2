package darioselor.domainLayer.persistence.repository.impl.jdbc.mappers;

import darioselor.domainLayer.domain.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {
    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();
        category.setId(rs.getLong("category_id"));
        category.setNameEs(rs.getString("category_name_es"));
        category.setNameEn(rs.getString("category_name_en"));
        category.setSlug(rs.getString("category_slug"));
        return category;
    }
}
