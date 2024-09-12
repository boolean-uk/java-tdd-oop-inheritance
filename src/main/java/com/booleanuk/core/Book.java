package com.booleanuk.core;

public class Book extends LibraryItem{
    private final Author author;

    public Book(String title) {
        super(title);
        this.author = null;
    }

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
