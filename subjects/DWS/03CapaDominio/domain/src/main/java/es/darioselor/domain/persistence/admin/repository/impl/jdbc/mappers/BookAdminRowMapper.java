package es.darioselor.domain.persistence.admin.repository.impl.jdbc.mappers;

import es.darioselor.domain.domain.admin.model.Book;
import es.darioselor.domain.persistence.common.CustomRowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class BookAdminRowMapper implements CustomRowMapper<Book> {

    PublisherAdminRowMapper publisherAdminRowMapper = new PublisherAdminRowMapper();
    CategoryAdminRowMapper categoryAdminRowMapper = new CategoryAdminRowMapper();
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setIsbn(rs.getString("books.isbn"));
        book.setTitleEs(rs.getString("books.title_es"));
        book.setTitleEn(rs.getString("books.title_en"));
        book.setSynopsisEs(rs.getString("books.synopsis_es"));
        book.setSynopsisEn(rs.getString("books.synopsis_en"));
        book.setPrice(rs.getFloat("books.price"));
        book.setDiscount(rs.getFloat("books.discount"));
        book.setCover(rs.getString("cover"));
        if (this.existsColumn(rs, "publishers.id")){
            book.setPublisher(publisherAdminRowMapper.mapRow(rs, rowNum));
        }
        if (this.existsColumn(rs, "categories.id")){
            book.setCategory(categoryAdminRowMapper.mapRow(rs, rowNum));
        }
        return book;
    }
}
