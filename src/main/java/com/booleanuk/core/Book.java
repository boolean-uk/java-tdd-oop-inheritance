package com.booleanuk.core;

public class Book extends LibraryItem {
    Author author;

    public Book(String title) {
        super(title);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }


}
