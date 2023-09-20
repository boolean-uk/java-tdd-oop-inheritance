package com.booleanuk.core;

public class Book extends Item {
    private Author author;

    public Book(String title) {
        super(title);
        this.author = null;
    }
    public Book(String title, Author author) {
        super(title);
        this.setAuthor(author);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
