package com.booleanuk.core;

public class Book extends Item {
    protected String title;
    protected Author author;
    boolean onLoan = false;

    public Book(String title) {
        super(title);
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
