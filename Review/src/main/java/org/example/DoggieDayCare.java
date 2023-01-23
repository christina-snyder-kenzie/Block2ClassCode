package org.example;

import java.util.ArrayList;

public class DoggieDayCare {
    private ArrayList<Dog> dogs;

    public DoggieDayCare(){
        dogs = new ArrayList<Dog>();
    }

    public int checkIn(String name, int age, double weight, ArrayList<String> snacks){
        Dog d = new Dog(name, age, weight, snacks);
        dogs.add(d);
        return d.getID();
    }

    public int checkIn(Dog d){
        dogs.add(d);
        return d.getID();
    }

    public Dog checkOut(String name, int ID){
        for (int i = 0; i < dogs.size(); i++){
            Dog d = dogs.get(i);
            if (d.getName().equals(name) && d.getID() == ID){
                dogs.remove(i);
                return d;
            }
        }
        return null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("~~Doggie Day Care Pups!~~\n");
        //for (dt item : collection)
        for (Dog d : dogs){
            sb.append(d.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
