package com.booleanuk.core;

public class Book extends LibraryItem{
    String title;
    Author author;
    boolean onLoan = false;

    public Book(String title) {
        super(title);
    }
    public Book(String title, Author author){
        super(title);
        this.author = author;
    }
}
