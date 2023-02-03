package org.example;

import java.sql.SQLOutput;

public class Animal {
    private int numLegs;
    private double weight;
    private boolean hasEyes, isInjured, isBlind;


    public Animal(int numLegs, double weight, boolean hasEyes){
        this.numLegs = numLegs;
        this.weight = weight;
        this.hasEyes = hasEyes;
        isInjured = false;
        isBlind = !hasEyes;
    }

    public void eat(){
        double weightIncrease = weight * 0.005;
        weight += weightIncrease;

        //weight *= 1.005;
        //weight += (weight * 0.005);

        System.out.println("NomNomNom... Yummy!");
    }

    public void sleep(){
        System.out.println("ZZZzzzZZZzzz");
    }

    public void fight(Animal other){
        //do we have any fighting rules?
        //if they're both injured-> 50/50 who dies
        //if other is injured and I'm not -> other dies
        //if I'm injured but other is not -> I flee
        //if we're both NOT injured -> the lighterone gets injured (bigger one wins)

        if (this.isInjured && other.isInjured){
            if (Math.random() < .5){
                System.out.println("I died... bummer.");
                other.eat();
            } else {
                System.out.println("Luckily, I won! My injured opponent was no match");
                this.eat();
            }
        } else if (other.isInjured && !this.isInjured){
            System.out.println("I won fair and square. My Opponent is dead.");
            this.eat();
        } else if (this.isInjured){
            System.out.println("I'm hurt, and run away");
        } else {
            //we're both healthy and not injured
            if (this.weight > other.weight){
                System.out.println("I'm bigger. I win");
                other.isInjured = true;
            } else {
                System.out.println("I'm smaller, my opponent wins");
                this.isInjured = true;
            }
        }
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double newWeight){
        this.weight = newWeight;
    }

    public void decreaseWeight(double amount){
        this.weight -= amount;
    }


}
