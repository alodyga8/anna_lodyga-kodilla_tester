package com.kodilla.inheritance;

public class Convertible extends Car {
    public void openRoof() {
        System.out.println("Opening roof...");
    }
    public void closeRoof () {
        System.out.println("CLosing roof...");
    }
//    @Override
    public void openingDoors() {
        System.out.println("Opening 2 doors");
    }
    public Convertible(int wheels, int seats) {
        super (wheels, seats);
        System.out.println("Convertible constructor");
    }
}
