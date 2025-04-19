package com.mason.library.library_checkout.services;

import com.mason.library.library_checkout.exception.BookInformationException;
import com.mason.library.library_checkout.managers.BookManager;
import com.mason.library.library_checkout.objects.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookService {
    @Autowired
    private BookManager bookManager;

    @GetMapping("/book/title")
    List<Book> getBooksByTitle(@RequestParam(
            value = "title") final String title) throws BookInformationException
    {
        return bookManager.getBooksByTitle(title);
    }

    @GetMapping("/book")
    List<Book> getBooks() throws BookInformationException
    {
        return bookManager.getAllBooks();
    }
}
