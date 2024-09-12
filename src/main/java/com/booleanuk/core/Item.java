package com.booleanuk.core;

public abstract class Item {
    String title;
    Author author;
    boolean onLoan = false;
    public Item(String title) {
        this.title = title;
        this.author = null;
    }
    public Item (String title, Author author)
    {
        this.title = title;
        this.author = author;
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
    public String getAuthor()
    {
        if (author!=null) {return author.getAuthorInformation();}
        else return "no specific Author";
    }

}
