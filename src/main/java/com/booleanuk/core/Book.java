package com.booleanuk.core;

public class Book extends LibraryItem {
    private final Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }
}
