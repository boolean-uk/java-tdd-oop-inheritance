package com.booleanuk.core.example;

public class Plane extends Vehicle{
    public Plane() {
        super(2000);
    }
    public boolean canFly () {
        return true;
    }

    public String move() {
//        return "Flyin at " + this.topSpeed;
        return "Taking off and" + super.move();

    }
}
