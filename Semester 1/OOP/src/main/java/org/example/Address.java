package org.example;

import java.util.ArrayList;

public class Address {
    private int houseNum;
    private String street, city, state, unit, zip;

    public Address(int houseNum, String street, String unit, String city, String state, String zip){
        this.houseNum = houseNum;
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(int houseNum, String street, String city, String state, String zip){
        this(houseNum, street, null, city, state, zip);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(houseNum).append(" ").append(street);
        if (unit != null){
            sb.append(", Unit ").append(unit);
        }
        sb.append("\n").append(city).append(", ").append(state);
        sb.append(" ").append(zip);
        return sb.toString();
    }

    public String getState(){
        return state;
    }
}
