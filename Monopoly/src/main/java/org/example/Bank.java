package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //private static instance
    //private constructor
    //public getter method (for the instance)
    private static Bank instance;
    private List<Property> properties;
    private int numHouses, numHotels, availableMoney;

    private Bank(){
        properties = new ArrayList<>();
        //TODO: Actually put properties in there
        numHouses = 25;
        numHotels = 10;
        availableMoney = 12000;
    }

    public static Bank getInstance(){
        if (instance == null){
            instance = new Bank();
        }
        return instance;
    }

    public int getNumProperties(){
        return properties.size();
    }

    public Property getProperty(int index){
        return properties.get(index);
    }

    //GOAL: The number of UNOwned properties
    //basket (counter)
    //loop
        //if statement (unowned prop)
            //basket++
    public int getNumUnOwned(){
        int basket = 0;
        for (Property prop : properties){
            if (!prop.isOwned()){
                basket++;
            }
        }
        return basket;
    }

    //Given an owner (Player), return all of their properties
    //in an arraylist
    //basket (arraylist)
    //loop
        //get the owner
        //if the player owns it
            //add (the player) the property to the basket
    //return the basket
    public ArrayList<Property> getPropsForOwner(Player owner){
        ArrayList<Property> basket = new ArrayList<>();
        for (Property prop : properties){
            Player propOwner = prop.getOwner();
            if (owner.equals(propOwner)){
                basket.add(prop);
            }
        }
        return basket;
    }

    public void distributeFunds(int amt, Player p){
        //What I want VS What the Bank Has VS What I get
        // 200              12000               200
        // 200              150                 150
        // 150              3000                150
        // 250              20                  20

        //Math.max(a, b) returns the larger
        //Math.min(a, b) returns the smaller

        int amtToTransfer = Math.min(amt, availableMoney);
        p.setBalance(p.getBalance() + amtToTransfer);
        availableMoney -= amtToTransfer;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public int getNumHouses() {
        return numHouses;
    }

    public int getNumHotels() {
        return numHotels;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }
}
