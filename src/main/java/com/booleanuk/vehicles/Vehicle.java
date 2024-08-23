package com.booleanuk.vehicles;

public abstract class Vehicle {
    protected int topSpeed;

    public Vehicle(int topSpeed){
        this.topSpeed=topSpeed;
    }

    public String move(){
        return "Travelling at "+this.topSpeed;

    }

    public String park(){
        return "We park the vehicle";
    }
}
