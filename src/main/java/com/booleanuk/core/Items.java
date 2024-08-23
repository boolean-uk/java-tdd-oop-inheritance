package com.booleanuk.core;

public class Items {
    String title;
    String authorName;
    boolean onLoan = false;

    public Items(String title) {
        this.title = title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }
    public String getAuthorName() {
        return authorName;
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
