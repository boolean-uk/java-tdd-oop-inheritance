package com.booleanuk.core;

public class Book extends Item {
    private Author author;

    public Book(String title) {
        super(title);
    }

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getAuthor() {
        return author == null ? "Unknown" : author.toString();
    }
}
