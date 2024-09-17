package com.booleanuk.example;

public class Vehicle {
    int topSpeed;

    public Vehicle(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String move() {
        return "I'm moving at " + this.topSpeed;
    }
}
