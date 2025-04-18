package com.mason.library.library_checkout.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * POJO to represent a book
 *
 * @author masonmyles
 */
@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    public Book() {}

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

    private Book(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.isbn = builder.isbn;
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long id;
        private String title;
        private String author;
        private String publisher;
        private String isbn;

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder withIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
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
