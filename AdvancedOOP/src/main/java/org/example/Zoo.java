package org.example;

public class Zoo {
    public static void main(String[] args) {
       // Animal lion = new Animal(4, 200, true);
     //   Animal duck = new Animal(2, 10, true);

        /*duck.fight(lion);
        //this should injure the duck
        duck.fight(lion);
        //the duck runs away
        System.out.println("Lion before: " + lion.getWeight());
        lion.fight(duck);
        System.out.println("Lion after: " + lion.getWeight());
*/
        /*
        Reptile gator = new Reptile(4, 685, true, 75, "Green");
        gator.shed();
        gator.sunBathe(120);
        System.out.println(gator.getBodyTemp());
        gator.eat();
        System.out.println(gator.getBodyTemp());

        Animal test = gator;
        test.sleep();
        System.out.println(test.getWeight());
        test.eat(); //it DOES lower the body temp
        //when I can do a more specific thing, I do it
        //test.shed();
        //test.getBodyTemp();
        System.out.println( ( (Reptile) test).getBodyTemp() );
        //System.out.println(test.getBodyTemp());

        Reptile temp = (Reptile) test;
        System.out.println(temp.getBodyTemp());
        */

        Snake sneaky = new Snake(2, 35, "Black", false);
        sneaky.sleep();
        System.out.println(sneaky.getBodyTemp());
        sneaky.eat();
        System.out.println(sneaky.getBodyTemp());
        sneaky.slither();

        Animal[] babies = sneaky.reproduce();
        System.out.println(babies.length);

        System.out.println(sneaky instanceof Snake);
        System.out.println(sneaky instanceof Reptile);
        System.out.println(sneaky instanceof Animal);
        System.out.println(sneaky instanceof Object);
/*
        System.out.println(lion instanceof Animal);
        System.out.println(lion instanceof Object);
        System.out.println(lion instanceof Snake);
        System.out.println(lion instanceof Reptile);
 */
    }
}
