package com.booleanuk.core;

public class Book extends Position {
    Author author;

    public Book(String title) {
        super(title);
    }

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }
}
