package com.booleanuk.core;

abstract public class RentableReadingMaterial extends ReadingMaterial{
    protected boolean onLoan = false;

    public RentableReadingMaterial(String title){
        super(title);
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "Item is not currently on loan.";
        }

        this.onLoan = false;

        return "Item has been checked in.";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "Item is currently on loan.";
        }

        this.onLoan = true;

        return "Item has been checked out.";
    }
}
