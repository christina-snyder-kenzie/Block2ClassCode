package org.example.warmup;

public abstract class Vehicle {
    protected int numPassengers;

    public Vehicle(int numPassengers){
        this.numPassengers = numPassengers;
    }

    public boolean canHold(int numFolks){
        return numFolks <= numPassengers;
    }

    public abstract void transport();

}
