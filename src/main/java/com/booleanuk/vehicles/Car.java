package com.booleanuk.vehicles;

public class Car extends Vehicle{

    public Car(int topSpeed){
        super(topSpeed);
        this.topSpeed=topSpeed+10;
    }
}
