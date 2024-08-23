package com.booleanuk.core;

public class Book extends RentableReadingMaterial{
    private final Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor(){ return this.author; }
}
