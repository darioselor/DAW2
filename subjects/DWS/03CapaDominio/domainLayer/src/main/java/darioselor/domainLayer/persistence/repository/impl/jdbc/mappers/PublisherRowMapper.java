package darioselor.domainLayer.persistence.repository.impl.jdbc.mappers;

import darioselor.domainLayer.domain.model.Publisher;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PublisherRowMapper implements RowMapper<Publisher> {
    @Override
    public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();
        publisher.setId(rs.getLong("publisher_id"));
        publisher.setName(rs.getString("publisher_name"));
        publisher.setSlug(rs.getString("publisher_slug"));
        return publisher;
    }
}
