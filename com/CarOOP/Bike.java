package com.CarOOP;

public class Bike extends Vehicle{
    String bikeName = "Honda";
    int model = 124578;
    public void bikeSound(){
        super.vehicleSound();
        System.out.println("bhuuuu bhuuuu bhuuu");
    }
}
