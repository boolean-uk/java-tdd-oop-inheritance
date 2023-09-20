package com.booleanuk.core.example;

public class Plane extends Vehicle{

    public Plane() {
        super(2000);
    }

    public boolean canFly() {
        return true;
    }

    @Override
    public String move() {
        return "Flying at " + this.topSpeed;
    }
}
