package org.example;

public class DogPark {
    public static void main(String[] args) {
        Dog diannasDog = new Dog();
        diannasDog.breed = "shihtzu";
        diannasDog.name = "Grizzly";
        diannasDog.age = 2;
        diannasDog.color = "brown";
        diannasDog.weight = 15;

        diannasDog.sleep();

        System.out.println(diannasDog.weight);
        diannasDog.eat(.5);
        System.out.println(diannasDog.weight);

        Dog puppy = new Dog("copper", "chihuahua", 2, "brown", 10);
       /* puppy.name = "copper";
        puppy.breed = "chihuahua";
        puppy.age = 2;
        puppy.color = "brown";
        puppy.weight = 10;*/

        Dog bigGuy = new Dog("Bruce", "Doberman", 8, "Black", 100);
        bigGuy.sleep();

        Dog rescue = new Dog("Carrie", 9, "black", 23);
        System.out.println(rescue.breed);

    }
}
