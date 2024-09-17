package com.booleanuk.core;

public class ReadingItem {
    protected String title;

    protected boolean onLoan = false;

    public ReadingItem(String title) {
        this.setTitle(title);
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "item is not currently on loan";
        }

        this.setOnLoan(false);

        return "item has been checked in";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "item is currently on loan";
        }

        this.setOnLoan(true);

        return "item has been checked out";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
