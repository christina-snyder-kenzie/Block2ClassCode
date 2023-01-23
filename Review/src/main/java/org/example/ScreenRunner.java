package org.example;

import java.util.*;

public class ScreenRunner {
    public static void main(String[] args){
        DoggieDayCare dayCare = new DoggieDayCare();
        Scanner scan = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing){
            displayOptions();
            String response = scan.nextLine();
            //options for response: 1, 2, 3 or literally anything else
            if (response.equals("1")){
                System.out.println("Check In");

                System.out.print("What is your dog's name? ");
                String name = scan.nextLine();

                System.out.print("How old is " + name + "? ");
                int age = Integer.parseInt(scan.nextLine());

                System.out.print("How much does " + name + " weigh? ");
                double weight = Double.parseDouble(scan.nextLine());

                //snack1,snack2,snack3,snack4

                //snack1
                //snack2
                //snack3
                //snack4
                //in a loop- keep looping until they enter a blank line

                /*
                prompt once
                grab response outside of loop
                while (response is not blank){
                    do something
                    grab new response
                 */
                System.out.println("Enter preferred snacks, one on each line.");
                System.out.println("Enter a blank line to stop");
                String snack = scan.nextLine();
                ArrayList<String> snackList = new ArrayList<String>();
                while (!snack.equals("")){
                    snackList.add(snack);
                    snack = scan.nextLine();
                }

                int ID = dayCare.checkIn(name, age, weight, snackList);
                System.out.println("Thank you for checking in " + name);
                System.out.println("Their checkout ID is: " + ID);

            } else if (response.equals("2")){
                System.out.println("Check Out");
                System.out.print("What is your dog's name? ");
                String name = scan.nextLine();
                System.out.print("What ID did we provide when you checked in? ");
                int ID = Integer.parseInt(scan.nextLine());

                Dog checkedOut = dayCare.checkOut(name, ID);
                System.out.println(checkedOut);
            } else if (response.equals("3")){
                System.out.println("View all Dogs");
                System.out.println(dayCare);
            } else {
                keepGoing = false;
            } //ends else ifs
        } //ends while loop
    } //ends my main method

    public static void displayOptions(){
        System.out.println("Choose 1, 2, or 3, or hit any other key to quit");
        System.out.println("\t1. Check In");
        System.out.println("\t2. Check Out");
        System.out.println("\t3. View All Dogs");
    }

} //ends my class
