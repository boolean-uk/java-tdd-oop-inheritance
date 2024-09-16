package com.booleanuk.core;

public  class Vehicle {
    protected int topSpeed;

    public Vehicle(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public String move(){
        System.out.println("In the base class move method");
        return "movin at:" + this.topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String wheels(){
        return "";
    }
}