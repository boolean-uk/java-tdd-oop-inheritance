package com.booleanuk.example;

public class Car extends Vehicle {
    String transmissionType;
    public Car(String transmissionType, int topSpeed){
        super(topSpeed);
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType(){
        return "I'm having a " + transmissionType + " transmission type";
    }
}
