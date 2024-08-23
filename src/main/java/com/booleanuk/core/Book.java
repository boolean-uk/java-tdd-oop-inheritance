package com.booleanuk.core;

public class Book extends Item{
    String title;

    boolean onLoan = false;

    public Book(String title, Author author) {
        super(title, author);
        this.type="Book";
    }


}
