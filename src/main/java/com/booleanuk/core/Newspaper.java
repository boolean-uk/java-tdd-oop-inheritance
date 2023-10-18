package com.booleanuk.core;

public class Newspaper extends ReadingItem{
    public Newspaper(String title) {
        super(title);
    }
//    String title;
//
//    boolean onLoan = false;
//
//    public Newspaper(String title) {
//        this.title = title;
//    }
//
//    public boolean isOnLoan() {
//        return onLoan;
//    }
@Override
    public String checkIn() {
        return "newspapers are not available for loan";
    }

    @Override
    public String checkOut() {
        return "newspapers are not available for loan";
    }
}
