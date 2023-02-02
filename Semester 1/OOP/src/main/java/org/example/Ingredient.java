package org.example;

public class Ingredient {
    public String name, measurement;
    public double amount;

    public Ingredient(double amount, String measurement, String name){
        //by default, when a property has the same name as a parameter
            //the name references the parameter
        // the this is a self-referencing variable
            // think about the pronoun 'I' (self-referencing pronoun)
        this.amount = amount;
        this.measurement = measurement;
        this.name = name;
    }

    public String toString(){
        return amount + " " + measurement + " " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
