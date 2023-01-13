package org.example;

import java.util.ArrayList;

public class Dog {
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> snackList;
    private int ID; //we need to generate this

    public Dog(String name, int age, double weight, ArrayList<String> snackList){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.snackList = snackList;
        ID = generateID();
    }

    private int generateID(){
        //GOAL: generate an ID
        //An ID is: a random 4 digit number

        // [a, b] -> (int) (Math.random() * (b - a + 1) + a);
        // [0-9] -> 7
        // 0000 -> 0, which is also a single digit
        // 0, 9999 -> 23?
        // [1000, 9999] -> 5432

        int multiplier = 9999 - 1000 + 1;
        int randomNumber = (int) (Math.random() * multiplier + 1000);
        return randomNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<String> getSnackList() {
        return snackList;
    }

    public int getID() {
        return ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSnackList(ArrayList<String> snackList) {
        this.snackList = snackList;
    }

    /*
    name1
        age: age1
        weight: weight1
        snacks: snackList1
     */
    public String toString(){
        StringBuilder sb = new StringBuilder(name);

        sb.append("\n\t");
        sb.append("age: ");
        sb.append(age);

        sb.append("\n\t");
        sb.append("weight: ");
        sb.append(weight);

        sb.append("\n\t");
        sb.append("snacks: ");
        sb.append(snackList);
        return sb.toString();

    }
}
