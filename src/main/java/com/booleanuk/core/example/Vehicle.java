package com.booleanuk.core.example;

public class Vehicle {
    protected int topSpeed;

    public Vehicle(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String move() {
        return "Moving at " + this.topSpeed;
    }
}
