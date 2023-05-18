package com.booleanuk.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> traffic = new ArrayList<>();
        traffic.add(new Car(100));
        traffic.add(new Plane(500));
        traffic.add(new Bike(30));
        traffic.add(new Car(70));

        System.out.println(traffic.get(1).topSPeed);
        // on the right of the = sign it's the Class
//        Vehicle porsche = new Porsche();
//        System.out.println(porsche.getClass());
//        Vehicle vehicle = getVehicle();
        Vehicle vehicle = new Car(100);
        System.out.println(vehicle.getClass());

    }
}
