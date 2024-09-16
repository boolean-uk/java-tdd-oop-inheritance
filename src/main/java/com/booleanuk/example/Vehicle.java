package com.booleanuk.example;

public class Vehicle {
    // abstract is a kind of a interface but then with more details in it.
    int topSPeed;
//    int topSPeed = 0;

    public Vehicle (int topSPeed){
        this.topSPeed = topSPeed;
    }

    public String move() {
        return "Moving at : " + this.topSPeed;
    }
}

// Base Class - Super Class - Parent class
