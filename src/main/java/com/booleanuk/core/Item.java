package com.booleanuk.core;

public abstract class Item {
    private Author author;
    private String title;
    private boolean onLoan;

    public Item(String title) {
        this.title = title;
        this.onLoan = false;
    }

    public Item(String title, Author author) {
        this(title);
        this.author = author;
    }

    private boolean isOnLoan() {
        return this.onLoan;
    }

    public String getTitle() {
        return title;
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

    public String getAuthorInfo() {
        return "Author: " + author.getName() + ", eMail: " + author.geteMail() + " and website: " + author.getWebsite();
    }
}
