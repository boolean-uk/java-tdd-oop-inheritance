package com.booleanuk.core;

public class Book extends ReadingItem{
    public Book(String title) {
        super(title);
    }
//    String title;
//
//    boolean onLoan = false;
//
//    public Book(String title) {
//        this.title = title;
//    }
//
//    public boolean isOnLoan() {
//        return onLoan;
//    }
//
//    public String checkIn() {
//        if (!this.isOnLoan()) {
//            return "item is not currently on loan";
//        }
//
//        this.onLoan = false;
//
//        return "item has been checked in";
//    }
//
//    public String checkOut() {
//        if (this.isOnLoan()) {
//            return "item is currently on loan";
//        }
//
//        this.onLoan = true;
//
//        return "item has been checked out";
//    }
}
