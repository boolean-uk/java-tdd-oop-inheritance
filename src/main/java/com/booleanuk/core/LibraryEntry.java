package com.booleanuk.core;

public abstract class LibraryEntry {

    private boolean onLoan = false;
    private String title;

    public LibraryEntry(String title) {
        this.title = title;
    }

    public boolean isOnLoan() {
        return this.onLoan;
    }

    public String getTitle() {
        return this.title;
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
