package com.mason.library.library_checkout.dao;

import com.mason.library.library_checkout.objects.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String FETCH_ALL_BOOKS = "select * from book";

    public List<Book> getAllBooksByTitle(String title) {
        return jdbcTemplate.query(FETCH_ALL_BOOKS, (rs, rowNum) ->
                Book.builder()
                        .withId(rs.getLong("id"))
                        .withTitle(rs.getString(title))
                    .build()
        );
    }
}
