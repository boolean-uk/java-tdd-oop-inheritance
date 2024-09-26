package com.booleanuk.core;


public abstract class Media {
    String title;
    boolean onLoan = false;

    public Media(String title){
        this.title = title;
    }
    public boolean isOnLoan() {
        return onLoan;
    }
    public abstract String checkIn();

    public abstract String checkOut();

}
