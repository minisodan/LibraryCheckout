package com.mason.library.library_checkout.managers;

import com.mason.library.library_checkout.dao.BookDAO;
import com.mason.library.library_checkout.exception.BookInformationException;
import com.mason.library.library_checkout.objects.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookManagerImpl implements BookManager{
    @Autowired
    BookDAO bookDAO;

    @Override
    public List<Book> getBooksByTitle(String title) throws BookInformationException
    {
        List<Book> books = bookDAO.getAllBooksByTitle(title);
        if (books.isEmpty()) {
            throw new BookInformationException("Book with title '" + title + "' not found");
        }
        return books;
    }

    @Override
    public List<Book> getAllBooks() throws BookInformationException {
        return bookDAO.getAllBooks();
    }

}
