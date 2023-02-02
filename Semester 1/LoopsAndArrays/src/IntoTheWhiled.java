public class IntoTheWhiled {
    public static void main(String[] args) {
        int number = 5;

        if (number < 10){
            System.out.println("hello");
        }
        //a while loop will execute/run UNTIL
        // the condition becomes false
        while (number < 10) {
            System.out.println("hello- " + number);
            number = number + 1; //number++; //number += 1;
        }
        System.out.println("The loop is finished!");
        System.out.println("The number is: " + number);

        //Let's print out multiples of 3
        //from 0 to 20
        //0, 3, 6, 9, 12, 15, 18
        int counter = 0; //the start AKA initialization
        while (counter < 20){
            System.out.println(counter);
            counter += 3; //counter = counter + 3;
        }

        //what if counter didn't start at 0?
        counter = -2;
        while (counter < 20){
            if (counter % 3 == 0){
                System.out.println(counter);
            }
            counter++;
        }

        System.out.println("----BEGIN COUNTDOWN SEQUENCE----");
        //initialize
        int countDown = 10;
        while (countDown > 0) { //the condition
            System.out.println(countDown + "!");
            countDown = countDown - 1; //countDown -= 1 //countDown--;
                //a decrement
        }
        System.out.println("BLASTOFF!!!");

        /*
            1. initialization
            2. while (condition)
            3.      do stuff
            4.      update/incrementation/decrementation
                        //this needs to approach the stopping condition
         */

        //I want to write a loop to print out all powers of 2 less than 100
        //1, 2, 4, 8, 16, 32, 64
        //0, 1, 2, 3,  4,  5,  6
        double powerOf2 = 1;
        while (powerOf2 < 100) {
            System.out.println(powerOf2);
            powerOf2 = powerOf2 * 2; //powerOf2 *= 2;
        }
        System.out.println("------------");
        int exponent = 0;
        while (Math.pow(2, exponent) < 100){
            //Math.pow(base, power)
            System.out.println(Math.pow(2, exponent));
            exponent++;
        }

        //print out multiples of 5 starting at 100 and stopping at 5
            //100, 95, 90, ... 15, 10, 5
        //print out powers of 2 starting at 128 and doing down to 1
            //128, 64, 32, 16, 8, 4, 2, 1
            //HINT: 2 ^ 7 == 128
        //print out even numbers between 0 and 99
            //0, 2, 4, 6... 96, 98
        int puppy = 0;
        while (puppy < 99){ //99 > puppy
            if (puppy % 2 == 0){
                System.out.println(puppy);
            }
            puppy++;
        }
    }
}
