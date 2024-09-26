package com.booleanuk.core;

import java.lang.reflect.Type;

public class Book extends Media{
   Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "item is not currently on loan";
        }

        this.onLoan = false;

        return "item has been checked in";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "item is currently on loan";
        }

        this.onLoan = true;

        return "item has been checked out";
    }
}
