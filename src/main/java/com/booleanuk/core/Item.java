package com.booleanuk.core;

public abstract class Item {
    String title;
    boolean onLoan = false;

    Author author;

    public Item(String title) {
        this.title = title;
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

    public String getAuthor() {
        if(author == null) {
            return "item does not have information about author(s)";
        }
        return "This item is written by " + author.getName() + " (e-mail: " + author.getEmail() + ", phone number: "
                + author.getPhoneNumber() +", website: " + author.getWebsite() + ")";
    }
}
