package com.booleanuk.core;

import java.sql.SQLOutput;

public class Plane extends Vehicle{
    public Plane(int topSpeed){
        //dette vil forstyrre koden din, og gi deg feilmelding
        //System.out.println("Hello");
        super(topSpeed);
    }
    public Plane(){
        super(1000);
    }
}