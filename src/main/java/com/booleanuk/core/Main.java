package com.booleanuk.core;

import com.booleanuk.core.example.Bike;
import com.booleanuk.core.example.Car;
import com.booleanuk.core.example.Plane;
import com.booleanuk.core.example.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle BMW = new Car(150);
        System.out.println(BMW.move());

        Vehicle jet = new Plane();
        System.out.println(jet.move());

        Vehicle bike = new Bike(200);
        System.out.println(bike.move());

        Vehicle vehicle = new Vehicle(10);
        System.out.println(vehicle.move());
    }
}
