package com.booleanuk.core;

public class Item {
    String title;
    Author author;
    boolean onLoan = false;


    public Item(String title) {
        this.title = title;
    }

    public Author getAuthor() { return this.author; }

    public void setAuthor(Author author) { this.author = author; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public void setOnLoan(boolean onLoan) { this.onLoan = onLoan; }

    public boolean isOnLoan() {
        return this.onLoan;
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
