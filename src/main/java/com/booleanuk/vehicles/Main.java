package com.booleanuk.vehicles;

public class Main {

    public static void main(String[] args) {
        Car car=new Car(120);
        Bike bike=new Bike(150);
        Plane plane=new Plane(400);

        System.out.println(car.move());

        System.out.println(plane.move());
        System.out.println(bike.move());
    }
}
