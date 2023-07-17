package com.booleanuk.example;

public class Pedestrian extends Vehicle {
    public Pedestrian(){
        super(5); //default value by superclass
    }

    @Override
    public String move(){
        return "Hey, I'm walking here!";
    }
}
