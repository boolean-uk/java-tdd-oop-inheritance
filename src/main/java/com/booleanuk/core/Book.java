package com.booleanuk.core;

public class Book extends Publication {

    public Book(String title) {
        super(title);
    }

    public Book(String title, Author author){
        super(title, author);
    }
}
