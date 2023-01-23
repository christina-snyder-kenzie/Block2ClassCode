package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "BigBoi";
        int age = 12;
        double weight = 123.4;
        ArrayList<String> snacks = new ArrayList<>();
        snacks.add("ham");
        snacks.add("milkbones");

        Dog d = new Dog(name, age, weight, snacks);
        System.out.println(d);
        System.out.println(d.getID());

        DoggieDayCare dayCare = new DoggieDayCare();
        //int ID = dayCare.checkIn(name, age, weight, snacks);
        int ID = dayCare.checkIn(d);
        int ID2 = dayCare.checkIn("TinyTom", 3, 11.5, new ArrayList<>());
        System.out.println(dayCare);

        Dog tt = dayCare.checkOut("TinyTom", ID2);
        System.out.println("----After checkout----");
        System.out.println(dayCare);
        System.out.println("----------");
        System.out.println(tt);
    }
}