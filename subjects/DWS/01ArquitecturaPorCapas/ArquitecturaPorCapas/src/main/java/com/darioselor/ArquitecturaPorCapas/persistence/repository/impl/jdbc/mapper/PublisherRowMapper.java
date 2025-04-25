package com.darioselor.ArquitecturaPorCapas.persistence.repository.impl.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.darioselor.ArquitecturaPorCapas.domain.model.Publisher;

public class PublisherRowMapper implements CustomRowMapper<Publisher> {

    @Override
    public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();
        publisher.setId(rs.getInt("publishers.id"));
        publisher.setName(rs.getString("publishers.name"));
        publisher.setSlug(rs.getString("publishers.slug"));
        return publisher;
    }
}