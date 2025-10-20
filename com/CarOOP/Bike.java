package com.CarOOP;

public class Bike extends Vehicle{

    Bike(){
        super();
        System.out.println("Bike is created");
    }
    String bikeName = "Honda";
    int model = 124578;
    public void bikeSound(){
        super.vehicleSound();
        System.out.println("bhuuuu bhuuuu bhuuu");
    }
}
