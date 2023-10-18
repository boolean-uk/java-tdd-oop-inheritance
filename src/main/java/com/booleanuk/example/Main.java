package com.booleanuk.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Manual", 100);
        Bike myBike = new Bike(150);
        Plane myPlane = new Plane(500);
        Pedestrian walker = new Pedestrian();
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Manual", 100));
        vehicles.add(new Car("Automatic", 120));
        vehicles.add(new Car("Manual", 90));
        vehicles.add(new Car("Manual", 60));

        vehicles.add(new Bike(160));
        vehicles.add(new Bike(170));
        vehicles.add(new Bike(190));

        vehicles.add(new Plane(440));
        vehicles.add(new Plane(500));

        //Output all of vehicles

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.move());
        }

    }
}
