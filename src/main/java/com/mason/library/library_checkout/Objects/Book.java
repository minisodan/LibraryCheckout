package com.mason.library.library_checkout.Objects;

import java.util.Objects;

/**
 * POJO to represent a book
 *
 * @author masonmyles
 */
public class Book {
    private long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    /**
     * Constructor.
     *
     * @param title title of the book
     * @param author author of the book
     * @param publisher publisher of the book
     * @param isbn isbn of the book
     */
    public Book(String title, String author, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    /**
     * Gets the book ID
     *
     * @return book ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Gets the title
     *
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author
     *
     * @return author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the publisher
     *
     * @return publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Gets the isbn
     *
     * @return isbn.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the Book ID
     *
     * @param id ID of the book to be set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the author
     *
     * @param author author of the book to be set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the title
     *
     * @param title title of the book to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the publisher
     *
     * @param publisher publisher of the book to be set.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Sets the Isbn
     *
     * @param isbn isbn of the book to be set.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return id == book.id && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publisher, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
