package org.example;

public class Reptile extends Animal{
    //call to super()
    private double bodyTemp;
    private String scaleColor;

    public Reptile(int numLegs, double weight, boolean hasEyes, double bodyTemp, String scaleColor){
        super(numLegs, weight, hasEyes);
        this.bodyTemp = bodyTemp;
        this.scaleColor = scaleColor;
    }

    //if we take in minutes, the body temp goes up 1 degree for each hour we sunbathe
    public void sunBathe(int minutes){
        bodyTemp += (minutes / 60);
    }

    //override the eat method
    //override = same method, same parameters, different insides
    //overload = same method, different parameters (and also different insides)
    public void eat(){
        super.eat();
        bodyTemp -= 2;
    }

    public void shed(){
        System.out.println("Shedding my " + scaleColor + " skin");
    }

    public double getBodyTemp(){
        return bodyTemp;
    }
}


class Snake extends Reptile {
    //Reptile(int numLegs, double weight, boolean hasEyes, double bodyTemp, String scaleColor)

    private boolean isVenomous;

    public Snake(double weight, double bodyTemp, String scaleColor, boolean isVenomous){
        super(0, weight, true, bodyTemp, scaleColor);
        this.isVenomous = isVenomous;
    }

    public void eat(){
        System.out.println("...Standby, unhinging jaw...");
        System.out.println("Ready to nom");
        super.eat();
    }

    public void slither(){
        System.out.println("ssssssslither");
        decreaseWeight(getWeight()*.005);
    }
}