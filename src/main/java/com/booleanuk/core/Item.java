package com.booleanuk.core;

public abstract class Item {
    private String title;
    private boolean onLoan=false;
    private Author author;
    protected String type;

    Item(String title, Author author){
        this.title=title;
        this.author=author;
    }

    Item(String title){
        this.title=title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        if (this.author==null){
            return null;
        }
        return author.getName();
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
