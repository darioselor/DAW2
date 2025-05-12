package es.darioselor.domain.persistence.user.repository.impl.jdbc.mappers;

import es.darioselor.domain.controller.common.locale.LanguageUtils;
import es.darioselor.domain.domain.user.model.Publisher;
import org.springframework.jdbc.core.RowMapper;


import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PublisherRowMapper implements RowMapper<Publisher> {

    @Override
    public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();
        publisher.setId(rs.getLong("publishers.id"));
        publisher.setName(rs.getString("publishers.name"));
        publisher.setSlug(rs.getString("publishers.slug"));
        return publisher;
    }
}
