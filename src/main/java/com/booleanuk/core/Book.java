package com.booleanuk.core;

public class Book extends Item{
    private final Author author;
    public Author getAuthor() {
        return author;
    }
    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }
}
