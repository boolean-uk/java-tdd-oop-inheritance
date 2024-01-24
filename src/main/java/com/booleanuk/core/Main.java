package com.booleanuk.core;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(120, "Manual"), new Plane(20), new Bike(50)};

        //Vehicle vehicle = new Vehicle(1);

        Vehicle singleVehicle = new Vehicle(111);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.move());

        }

        //System.out.println("Vehicle "+  vehicle.move());
    }
}