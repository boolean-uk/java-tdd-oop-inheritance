package com.booleanuk.core;

public class Car extends Vehicle{
    String transmissionType;
   public Car(int topSpeed, String transmissionType){
       super(topSpeed);
       this.transmissionType = transmissionType;
   }
   public String move(){
       System.out.println("In the override move method in car");
       return "Moving at: " + this.getTopSpeed() + " using a " + this.transmissionType +" transmission Type";
   }

}
