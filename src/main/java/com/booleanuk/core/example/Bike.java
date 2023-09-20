package com.booleanuk.core.example;

public class Bike extends Vehicle{
    public Bike(int topSpeed) {
        super(topSpeed);
    }
    public boolean canDoaWheelie() {
        return true;
    }
}
