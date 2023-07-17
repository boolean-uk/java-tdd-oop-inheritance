package com.booleanuk.core;

public class LibraryItem {

    String title;

    boolean onLoan = false;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String checkIn(){
        if (!this.isOnLoan()) {
            return  this.getClass().getSimpleName() + " is not currently on loan";
        }

        this.onLoan = false;

        return this.getClass().getSimpleName() + " has been checked in";
    }
    public String checkOut(){
        if (this.isOnLoan()) {
            return this.getClass().getSimpleName() + " is currently on loan";
        }

        this.onLoan = true;

        return this.getClass().getSimpleName() + " has been checked out";
    }

    public boolean isOnLoan() {
        return onLoan;
    }
}
