package com.CarOOP;

public class Jeep {
    Jeep(){
        System.out.println("Jeep is created...");
    }
    String jeepModel = "Thar Rox";

    class Thar{
        Thar(){
            System.out.println("Thar is created...");

        }
        public String modelName(){
            return jeepModel;
        }
    }
}
