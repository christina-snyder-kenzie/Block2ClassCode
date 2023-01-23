package org.example;

public class Car {
    private double worth;
    private int numSeats;
    private String VIN;

    public Car(String VIN, double worth, int numSeats){
        this.VIN = VIN;
        this.worth = worth;
        this.numSeats = numSeats;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "worth=" + worth +
                ", numSeats=" + numSeats +
                ", VIN='" + VIN + '\'' +
                '}';
    }

}
