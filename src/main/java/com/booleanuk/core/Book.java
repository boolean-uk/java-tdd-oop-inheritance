package com.booleanuk.core;

public class Book extends Literature{

    private Author author;

    public Book(String title) {
        super(title);
    }

    public Author getAuthor() {
        return this.author;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }
}
