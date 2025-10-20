package com.CarOOP;

public class Main {
    public void publicmethod(){
        System.out.println("main public method");
    }
    static void staticmethod(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        Car myCar1 = new Car("Mustang", 2024);
        Car myCar2 = new Car("Ferrari");
        Enum.Level myVar = Enum.Level.HIGH;
        System.out.println(myVar);
        Bike myBike = new Bike();
        Jeep myJeep = new Jeep();
        Jeep.Thar  myThar = myJeep.new Thar();
        System.out.println("Car 1 : " + myCar1.getChesisNumber());// encapsulation get and set
        myCar2.setChesisNumber(9783);
        System.out.println("Car 2 : " + myCar2.getChesisNumber());
        myCar2.setSeats(2);
        System.out.println("Car 2 which is " + myCar2.carName + " has " + myCar2.getSeats() + " saets");
        myCar2.printInfo();
        myCar1.publicspeed();
        myCar1.staticFullthrottle();
        myBike.bikeName = "H'ness 350";
        System.out.println("my bike is " + myBike.bikeName + "which sounds like " );
        myBike.bikeSound();

        myCar1.printInfo();
        staticmethod();
        Main myMain = new Main();
        myMain.publicmethod();
    }
}
