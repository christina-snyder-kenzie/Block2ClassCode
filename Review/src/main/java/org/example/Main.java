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
    }
}