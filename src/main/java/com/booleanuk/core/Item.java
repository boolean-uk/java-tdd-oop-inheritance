package com.booleanuk.core;

public abstract class Item {

    String title;
    boolean onLoan;
    public Item(String title) {
        this.title = title;
        this.onLoan = false;
    }

    private boolean isOnLoan() {
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
