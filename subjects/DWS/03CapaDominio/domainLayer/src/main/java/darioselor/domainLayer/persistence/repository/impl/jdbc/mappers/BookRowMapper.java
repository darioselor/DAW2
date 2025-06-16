package darioselor.domainLayer.persistence.repository.impl.jdbc.mappers;

import darioselor.domainLayer.domain.model.Book;
import darioselor.domainLayer.domain.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements CustomRowMapper<Book> {

    private final PublisherRowMapper publisherRowMapper = new PublisherRowMapper();
    private final CategoryRowMapper categoryRowMapper = new CategoryRowMapper();

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setIsbn(rs.getString("isbn"));
        book.setTitleEs(rs.getString("title_es"));
        book.setTitleEn(rs.getString("title_en"));
        book.setSynopsisEs(rs.getString("synopsis_es"));
        book.setSynopsisEn(rs.getString("synopsis_en"));
        book.setPrice(rs.getFloat("price"));
        book.setDiscount(rs.getFloat("discount"));
        book.setCover(rs.getString("cover"));
        if (this.existsColumn(rs, "publisher_id")) {
            book.setPublisher(publisherRowMapper.mapRow(rs, rowNum));
        }
        if (this.existsColumn(rs, "category_id")) {
            book.setCategory(categoryRowMapper.mapRow(rs, rowNum));
        }
        return book;
    }
}
