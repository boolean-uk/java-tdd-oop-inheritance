package com.booleanuk.core;

public abstract class Product {
    String title;

    boolean onLoan = false;

    public Product(String title) {
        this.title = title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public abstract String checkIn();

    public abstract String checkOut();
}
