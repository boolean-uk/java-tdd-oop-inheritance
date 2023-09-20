package com.booleanuk.core.example;

public class Car extends Vehicle{
    public Car(int topSpeed) {
        super(topSpeed);
        System.out.println("This car has a top speed of: " + this.topSpeed);
    }
}
