package org.example.singleton;

public class Treasury {
    //1. Private static instance
    private static Treasury instance;

    private double amtOfMoney;
    //2. Private Constructor
    private Treasury(){
        //initialize properties (not the instance though...)
        amtOfMoney = 1000000000;
    }
    //3. Public static getInstance method
    public static Treasury getInstance(){
        if (instance == null){
            instance = new Treasury();
        }
        return instance;
    }

    public void printMoney(){
        amtOfMoney++;
    }

    public double getMoney(){
        return amtOfMoney;
    }
}
