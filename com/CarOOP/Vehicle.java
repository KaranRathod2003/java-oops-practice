package com.CarOOP;

public class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is created...");
    }
    protected String brand = "Mahindra";
    private int seats = 4;
    public int getSeats(){
        return seats;
    }
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void vehicleSound(){
        System.out.println("bhrum bhrum bhrum...");
    }

}
