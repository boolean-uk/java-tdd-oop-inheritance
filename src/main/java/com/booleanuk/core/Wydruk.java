package com.booleanuk.core;

public class Wydruk {

    public String getTitle() {
        return title;
    }

    private String title;
    private boolean onLoan= false;

    public Wydruk(String title) {
        this.title = title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "item is not currently on loan";
        }

        setOnLoan(false);

        return "item has been checked in";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "item is currently on loan";
        }

        setOnLoan(true);

        return "item has been checked out";
    }
}
