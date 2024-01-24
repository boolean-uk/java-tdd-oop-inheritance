package com.booleanuk.core;

public class Book extends WrittenObject {

    private Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }
}
