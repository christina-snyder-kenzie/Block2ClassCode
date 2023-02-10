package org.example;

import java.util.ArrayList;

public class Craft extends Activity{
    private ArrayList<Supply> supplies;

    public Craft(String name){
        super(name);
        supplies = new ArrayList<>();
    }

    //buy supplies (name, amount, color)
    //do I always make a new object and add it to supplies?
    //thread - 2 - yellow
    //thread - 5 - pink

    //thread - 7 - yellow
    //or
    //thread - 9 - yellow?

    //fabric - 1 - white -> just goes in

    //if I don't have the supply, add it in
    //if I have the supply-> update the quantity
    public void buySupply(String name, int quantity, String color){
        Supply bought = new Supply(name, quantity, color);
        int index = supplies.indexOf(bought);
        if (index == -1){
            supplies.add(bought);
        } else {
            Supply existing = supplies.get(index);
            existing.quantity += bought.quantity;
        }
    }

    public void dew(){
        super.dew();
        for (Supply s : supplies){
            System.out.println(s);
        }
    }

    public class Supply{
        String name;
        int quantity;
        String color;

        public Supply(String name, int quant, String color){
            this.name = name;
            this.quantity = quant;
            this.color = color;
        }

        public boolean equals(Object other){
            if (this == other){
                return true;
            }
            if (other == null){
                return false;
            }
            if (! (other instanceof Supply)){
                return false;
            }

            Supply otherSupply = (Supply) other;

            return this.name.equals(otherSupply.name) &&
                    this.color.equals(otherSupply.color);
        }

        public String toString(){
            return name + " - " + quantity + " - " + color;
        }
    }

} // ends the craft class
