package com.mason.library.library_checkout.managers;

import com.mason.library.library_checkout.exception.BookInformationException;
import com.mason.library.library_checkout.objects.Book;

import java.util.List;

public interface BookManager {
    List<Book> getBooksByTitle(String title) throws BookInformationException;
}
