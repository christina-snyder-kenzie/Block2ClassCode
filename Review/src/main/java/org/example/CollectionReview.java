package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionReview {

    // Static methods could go here

    public static void main(String[] args){
        System.out.println("Hello, Kenzie!");

        String name = "Christina";
        System.out.println("Hello " + name);

        String[] heroes = {"Captain America", "IronMan", "Hulk", "Black Widow", "Hawk Eye", "Thor"};
        System.out.println(heroes);
        System.out.println(Arrays.toString(heroes));
        System.out.println(countDoubleNames(heroes));
        System.out.println(countLetters(heroes));
        printBackwards(heroes);

        String cap = heroes[0];
        //write a loop that will print out the 'a's in cap
        for (int i = 0; i < cap.length(); i++){
            if (cap.charAt(i) == 'a' || cap.charAt(i) == 'A'){
                System.out.println(i);
            }
        }
        /*
        write a loop for each index
            grab the letter at the index
            see if it's an a
                print out the index
         */

        int[] numbers = {-2, 44, -103, -12, 56, 7};

        //print it out if its positive
        //if its positive, print it out
        //if the number is positive, print the number out
        //if arr[i] is positive, print arr[i] out
        //if arr[i] > 0, print arr[i] out
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i]);
            }
        }

        //sum the array
        //add up the numbers in the array
        //add up every number in the array
        //we add each number to a running total
            //I need a running total -> bucket
        //each number -> for i loop, and we index (arguably, for each loop)
        //add each number to a running total
            //like +=
            //total += each number
        System.out.println("-------");
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
            int each = numbers[i];
            total += each;
            System.out.println(total);
        }
        System.out.println("Final total: " + total);

        //sum only the positive numbers
        int posTotal = 0;
        for (int i = 0; i < numbers.length; i++){
            int each = numbers[i];
            if (each > 0){
                posTotal += each;
            }
        }
        System.out.println("Positive total: " + posTotal);

        ArrayList<Integer> onlyPos = collectPositives(numbers);
        System.out.println(onlyPos);
        printDiv3(onlyPos);

        updateDiv3(onlyPos);
        System.out.println(onlyPos);

        updateDiv3(collectPositives(numbers)); //broken?

    }// ends my main method

    //GOAL: write an in-place update to make the array divided by 3
    public static void updateDiv3(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++){
            int each = numbers.get(i);
            numbers.set(i, each / 3);
        }
    }


    //GOAL: Given an arraylist, print each number divided by 3
    public static void printDiv3(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++){
            int each = numbers.get(i);
            System.out.println(each / 3.0);
        }
    }

    //GOAL: Create an arraylist with ONLY positive numbers
    public static ArrayList<Integer> collectPositives(int[] numbers){
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++){
            int each = numbers[i];
            if (each > 0){
                toReturn.add(each);
            }
        }
        return toReturn;
    }

    //GOAL: Print out backwards:
    public static void printBackwards(String[] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
    //GOAL: Count number of letters
    public static int countLetters(String[] data){
        int count = 0;
        for (String hero : data){
            count += hero.length();
        }
        return count - countDoubleNames(data);
    }


    //I prefer methods go down here
    //GOAL: Count superheroes with double names
        // a double name contains a space
    public static int countDoubleNames(String[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            String current = arr[i];
            if (current.contains(" ")){
                count++;
            }
        }
        return count;
    }



}
