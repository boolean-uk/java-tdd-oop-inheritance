package com.booleanuk.core;

public class Book extends Document {

    Author author;
    public Book(String title) {
        super(title);

    }

    public Book(String title, Author author){
        this(title);
        this.author = author;
    }
}
