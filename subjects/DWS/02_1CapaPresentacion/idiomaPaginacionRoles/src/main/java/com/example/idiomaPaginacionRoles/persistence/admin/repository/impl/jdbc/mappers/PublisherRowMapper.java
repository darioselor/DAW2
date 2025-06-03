package com.example.idiomaPaginacionRoles.persistence.admin.repository.impl.jdbc.mappers;

import com.example.idiomaPaginacionRoles.domain.admin.model.Publisher;
import org.springframework.jdbc.core.RowMapper;

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
