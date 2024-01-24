package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class LibraryItem {
    String title;
    boolean onLoan = false;
    private Author author;
    public LibraryItem(String title,Author author) {
        this.title = title;
        this.author=author;
    }
    public Author getAuthor() {
        return author;
    }
    public boolean isOnLoan() {
        return onLoan;
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
