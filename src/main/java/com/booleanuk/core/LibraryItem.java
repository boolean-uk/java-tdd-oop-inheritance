package com.booleanuk.core;

public class LibraryItem {
    String title;
    boolean onLoan = false;

    public LibraryItem(String title){
        this.title=title;
    }
    public boolean isOnLoan(){
        return onLoan;
    }
    public String checkIn(){
        if (!this.isOnLoan()){
            return "item has been checked in";
        }
        this.onLoan=true;
        return "item has been checked out";
    }
    public String checkOut(){
        if (!this.isOnLoan()){
            return "item has been checked out";
        }
        this.onLoan=true;
        return "item has not been checked out";
    }

}
