package com.mason.library.library_checkout.dao;

import com.mason.library.library_checkout.exception.BookInformationException;
import com.mason.library.library_checkout.objects.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String FETCH_BOOKS_BY_TITLE = "SELECT * FROM \"Book\" WHERE LOWER(\"title\") LIKE LOWER(?)";
    private final String FETCH_ALL_BOOKS = "SELECT * FROM \"Book\"";

    private final RowMapper<Book> bookMapper = (rs, numRow) ->
            Book.builder()
                    .withId(rs.getLong("id"))
                    .withTitle(rs.getString("title"))
                    .withAuthor(rs.getString("author"))
                    .withPublisher(rs.getString("publisher"))
                    .withIsbn(rs.getString("isbn"))
                    .build();

    public List<Book> getAllBooksByTitle(String title) throws BookInformationException
    {
        String titlePattern = "%" + title + "%";

        List<Book> books = jdbcTemplate.query(FETCH_BOOKS_BY_TITLE, bookMapper, titlePattern);

        if (books.isEmpty()) {
            throw new BookInformationException("Book with title '" + title + "' not found");
        }

        return books;
    }

    public List<Book> getAllBooks() throws BookInformationException
    {
        List<Book> books = jdbcTemplate.query(FETCH_ALL_BOOKS, bookMapper);

        if (books.isEmpty()) {
            throw new BookInformationException("Books couldnt be fetched");
        }

        return books;
    }
}