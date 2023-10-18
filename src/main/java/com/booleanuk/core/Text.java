package com.booleanuk.core;

public class Text {
    private String title;
    private boolean onLoan;

    public Text(String title) {
        this.title = title;
        onLoan = false;
    }

    public void setOnLoan() {
        this.onLoan = !onLoan;
    }

    public boolean isOnLoan() {
        return onLoan;
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
}