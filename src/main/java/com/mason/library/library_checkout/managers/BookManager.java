package com.mason.library.library_checkout.managers;

import com.mason.library.library_checkout.exception.BookInformationException;
import com.mason.library.library_checkout.objects.Book;

import java.util.List;

public interface BookManager {
    /**
     * Fetches book by passed in to title.
     *
     * @param title
     *      Title of the book that is to be fetched.
     * @return List of books that have the title passed in.
     * @throws BookInformationException if any low level exceptions are thrown.
     */
    List<Book> getBooksByTitle(String title) throws BookInformationException;

    /**
     * Fetches all books
     *
     * @return a list of every book
     * @throws BookInformationException if any low level exceptions are thrown.
     */
    List<Book> getAllBooks() throws BookInformationException;
}
