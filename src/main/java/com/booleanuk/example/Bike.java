package com.booleanuk.example;

public class Bike extends Vehicle{
//    private int topSPeed;
//
//    public Bike (int topSPeed){
//        this.topSPeed = topSPeed;
//    }
//
//    public String move() {
//        return "Moving at : " + this.topSPeed;
//    }

    public Bike (int topSPeed){
        // this calls the constructor of the vehicle
        super(topSPeed);
    }
}
