package com.mason.library.library_checkout.Objects;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    public Book(String title, String author, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }


}
