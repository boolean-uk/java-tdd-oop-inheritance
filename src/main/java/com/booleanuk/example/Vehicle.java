package com.booleanuk.example;

public class Vehicle {
    protected int topSPeed;

    public Vehicle (int topSPeed){
        this.topSPeed = topSPeed;
    }

    public String move() {
        return "Moving at : " + this.topSPeed;
    }
}

// Base Class - Super Class - Parent class
