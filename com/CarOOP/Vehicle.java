package com.CarOOP;

public class Vehicle {
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
