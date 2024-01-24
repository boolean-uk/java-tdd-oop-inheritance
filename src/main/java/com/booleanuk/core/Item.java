package com.booleanuk.core;

public class Item {
    String title;
    Boolean onLoan = false;

    public Item(String title){
        this.title = title;
    }
    public boolean isOnLoan(){
        return onLoan;
    }
    public String checkIn() {
        if (!this.onLoan){
            return "item is not currently on loan";
        }
        this.onLoan = false;

        return "item has been checked in";
    }

    public String checkOut() {
        if (this.onLoan){
            return "item is currently on loan";
        }
        this.onLoan = true;
        return "item has been checked out";
    }
}
