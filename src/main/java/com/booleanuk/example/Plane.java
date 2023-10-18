package com.booleanuk.example;

public class Plane extends Vehicle{
    private int topSPeed;

    public Plane (int topSPeed){
        // this calls the constructor of the vehicle
        super(topSPeed);
    }
    @Override
    public String move() {
        return "Flies at : " + this.topSPeed;
    }
}
