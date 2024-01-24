package com.booleanuk.core;

public class Book extends Item {
    String title;

    boolean onLoan = false;

    public Book(String title) {
        super(title);
    }

    public boolean isOnLoan() {
        return onLoan;
    }
}
