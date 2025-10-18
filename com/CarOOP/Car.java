package com.CarOOP;

public class Car extends Vehicle {
    int modelYear;
    String carName;
    // constructor with Two parameter
    public Car(String carName, int modelYear){
        this.modelYear = modelYear;
        this.carName = carName;
    }
    //constructor with one parameter
    public Car(String carName){
        this(carName, 2023);
    }
    public void printInfo(){
        System.out.println("Car is " + carName + " of year " + modelYear);
    }
    public void staticFullthrottle(){
        System.out.println("RPM : 1400");
    }
    public void publicspeed(){
        System.out.println("200kmph");
    }
    // access modifier
    private int chesisNumber  = 123678;// Private - only accessible inside this class
    public String carColor = "Black"; // Public - accessible everywhere
    public int getChesisNumber(){
        return chesisNumber;
    }
    public void setChesisNumber(int chesisNumber){
        this.chesisNumber = chesisNumber;
    }


}
