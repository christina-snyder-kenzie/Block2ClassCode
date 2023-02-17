package org.example.warmup;

/*
Your task:
Make a Tesla, that is a car and implements Electric.
Make it compile (no red)
 */
public class Car extends Vehicle implements Rollable{
    protected double mpg;
    protected boolean hasRadio;

    public Car(int numPassengers, double mpg, boolean hasRadio){
        super(numPassengers);
        this.mpg = mpg;
        this.hasRadio = hasRadio;
    }

    public void transport(){
        System.out.println("Driving to you!");
    }

    public void roll(){
        System.out.println("Wheeels are a rollin");
    }
}
