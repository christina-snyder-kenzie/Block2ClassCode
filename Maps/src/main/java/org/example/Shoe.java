package org.example;

public class Shoe {
    //properties
    //Size
    //Color
    //Type
    //Brand
    private double size;
    private String color, type, brand;

    //constructors
    public Shoe(double size, String color, String type, String brand){
        this.size = size;
        this.color = color;
        this.type = type;
        this.brand = brand;
    }

    //getters and setters

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //toString

    @Override
    public String toString() {
        return "Shoe{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    //code the.equals method
    //for the sake of the argument, different sizes can be the same shoe
    //THe color, type, and brand MUST match for them to be same
    public boolean equals(Object other){
        if (this == other){ //reflexivity
            return true;
        }
        if (other == null){ //non-nullity
            return false;
        }
        //logical equality
        //but first, make sure we have shoe
        if (!(other instanceof Shoe)) {
            return false;
        }
        //type-case
        Shoe otherShoe = (Shoe) other;
        //polymorphism -> next week
        //double otherSize = otherShoe.size;
        //double otherSizeAgain = other.size; doesn't work

        return this.color.equals(otherShoe.getColor()) &&
                this.brand.equals(otherShoe.getBrand()) &&
                this.type.equals(otherShoe.getType());
    }
}
