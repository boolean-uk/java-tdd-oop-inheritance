package com.booleanuk.vehicles;

public class Plane extends Vehicle{
    private int numberOfWings;
    public Plane(int topSpeed){
        super(topSpeed);
        this.numberOfWings=2;
    }

    public int howManyWings(){
        return this.numberOfWings;
    }
}


