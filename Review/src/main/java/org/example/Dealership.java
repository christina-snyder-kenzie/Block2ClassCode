package org.example;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> inventory;

    public Dealership(){
        inventory = new ArrayList<>();
    }

    public void addCar(Car c){
        inventory.add(c); //triggers a NPE
        //NPE: null pointer exception
        //A NPE happens when I call a method
        //upon an object which is null
    }

    public ArrayList<Car> findCarsUnderBudget(double budgetPrice){
        ArrayList<Car> toReturn = new ArrayList<Car>();
        for (Car currentCar : inventory){
            if (currentCar.getWorth() <= budgetPrice){
                toReturn.add(currentCar);
            }
        }
        return toReturn;
    }

    public ArrayList<Car> findCarsWithSeats(int numSeats){
        ArrayList<Car> toReturn = new ArrayList<>();
        for (Car current : inventory){
            if (current.getNumSeats() == numSeats){
                toReturn.add(current);
            }
        }
        return toReturn;
    }

    public Car sell(String VIN, double amountOfMoney){
        for (Car c : inventory){
            if (c.getVIN().equals(VIN)){
                if (amountOfMoney >= c.getWorth()){
                    return c;
                }
            }
        }
        return null;
    }


}
