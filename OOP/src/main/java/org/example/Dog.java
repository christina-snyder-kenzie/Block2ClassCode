package org.example;

public class Dog {
    //properties
        //breed
        //weight
        //name
        //color
        //age
        //hair length
        //quirk
        //height

    public String name, color, breed;
    public int age;
    public double weight;

    //constructors
    //general format:
        //public className(parameters) { hook up your properties }
    public Dog(String n, String b, int a, String c, double w){
        name = n;
        breed = b;
        age = a;
        color = c;
        weight = w;
    }
    /*
    NOT ALLOWED, because same parameter data types
    public Dog(String n, int a, String b, double w){
        breed = b;
    }
    */

    public Dog(String n, String b, int a, double w){
        name = n;
        breed = b;
        age = a;
        weight = w;
        color = "unknown";
    }

    public Dog(String n, int a, String c, double w){
        name = n;
        age = a;
        color = c;
        weight = w;
        breed = "Mixed";
    }

    //no-argument constructor
    //the java gods provide the no-argument constructor by DEFAULT
    //the no-argument constructor initializes properties to their default values
    public Dog() {
        //empty
    }

    //behaviors
        //eat
        //bark
        //sleep
        //walk
        //play / fight
        //chase

    public void eat(double amtInPounds){
        System.out.println("YUM!");
        weight += amtInPounds;
    }

    public void sleep(){
        System.out.println("ZzZzZzZz");
        if (weight > 50){
            System.out.println("SNORE SNORE SNORE");
        }
        if (breed.equalsIgnoreCase("shihtzu")){
            System.out.println("Get them squirrels!");
        }
    }
}
