package com.booleanuk.core.example;

public class SportsCar extends Car {
    private boolean turboCharged;

    public SportsCar(int topSpeed) {
        super(topSpeed);
        this.turboCharged = true;
    }

    public boolean isTurboCharged() {
        return this.turboCharged;
    }
}
