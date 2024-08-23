package com.booleanuk.vehicles;

public class Bike extends Vehicle{

    public Bike(int topSpeed){
        super(topSpeed);
    }

    @Override
    public String park(){
        return "We park the bike";
    }
}
