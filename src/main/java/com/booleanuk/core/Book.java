package com.booleanuk.core;

public class Book extends Item {

    public Book(String title, Author author) {
        super(title);
        super.author = author;
    }
}
