package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> candies = new ArrayList<String>();
        candies.add("snickers");
        candies.add("kitkat");
        candies.add("almond joy");
        candies.add(0, "twix");
        System.out.println(candies);

        candies.set(candies.size() - 1, "Pixie Stick");
        System.out.println(candies);

        String removed = candies.remove(1);
        System.out.println("Removed: " + removed);
        System.out.println(candies);

        int total = countCharacters(candies);
        System.out.println(total);

        //int, double, boolean, char -> primitive types
        //WRAPPER CLASSES
        //Integer, Double, Boolean, Character -> object types!

        //a Integer holds a int
            //Integer is like a present, within the present box
                //there is a little int
        Integer x = new Integer(7);
        Integer y = 7; //auto-boxing
        //auto-boxing is an automatic process where primitive types
            //get wrapped in an object
        int z = 7;
        int a = y; //auto-un-boxing, taking the primitive out of the object

        //when you create an array list, you use the wrapper class
        //when you retrieve information, you can use the primitive type
                //because autoboxing/unboxing
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        ArrayList<Integer> boring = generateRandom(10, 1, 10);
        System.out.println(boring);
        ArrayList<Integer> exciting = generateRandom(150, 500, 900);
        System.out.println(exciting);

        double average = calcAverage(exciting);
        int maxValue = findMax(exciting);
        System.out.println("Average: " + average + ", Max: " + maxValue);

        int[] array800 = makeArray800(exciting);
        ArrayList<Integer> list800 = makeList800(exciting);
        System.out.println(Arrays.toString(array800));
        System.out.println(list800);
    }

    //collect numbers greater than 800

    //first way: Collect into an array
        // 1. COUNT so that we know the size
        // 2. Make a new array (data type and size)
        // 3. Fill (using our specialIndex)
    public static int[] makeArray800(ArrayList<Integer> list){
        int size = countGreater800(list);
        int[] toReturn = new int[size];

        int specialIndex = 0;
        for (int curr : list){
            if (curr > 800){
                toReturn[specialIndex] = curr;
                specialIndex++;
            }

        }
        return toReturn;
    }

    //MINI GOAL: I want to write  a method that will COUNT how many numbers > 800
    public static int countGreater800(ArrayList<Integer> list){
        //init
        int counter = 0;
        //loop-> for each?
        for (int currNumber : list) {
            //if statement -> > 800?
            if (currNumber > 800) {
                //update
                counter++;
            }
        }
        //return
        return counter;
    }

    //second way: collect into an ArrayList
    public static ArrayList<Integer> makeList800(ArrayList<Integer> list){
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int currNumber : list){
            if (currNumber > 800){
                toReturn.add(currNumber);
            }
        }
        return toReturn;
    }



    //WRITE TWO methods
    //1. Calculate the average number in an ArrayList
            //sum, then divide by the number of numbers
    public static double calcAverage(ArrayList<Integer> list){
        //init basket
        double basket = 0;
        //loop
        for (int currNumber : list) {
            //update basket
            basket += currNumber;
        }
        //return
        return basket / list.size();
    }

    //2. Find the maximum number in an ArrayList
        //init, loop, comparison, update
    public static int findMax(ArrayList<Integer> list){
        //init max
        int max = list.get(0);
        //loop
        for (int i = 0 ; i < list.size(); i++) {
            int currNumber = list.get(i);
            //compare
            if (currNumber > max) {
                //update
                max = currNumber;
            }
        }
        return max;
    }


    //generate N random integers between A and B inclusive
    //int number = (int) (Math.random() * (B - A + 1)) + A;
    public static ArrayList<Integer> generateRandom(int N, int A, int B){
        //1
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int count = 0; count < N; count++){
           //2
            int number = (int) (Math.random() * (B - A + 1)) + A;
            toReturn.add(number);
        }
        //3
        return toReturn;
    }

    //GOAL: Count how many characters total in the ArrayList
    //methods -> returnType, name, parameters
    public static int countCharacters(ArrayList<String> list){
        int counter = 0;
        for (int i = 0; i < list.size(); i++){
            String currWord = list.get(i);
            int numCharacters = currWord.length();
            counter += numCharacters;

            //counter += list.get(i).length();
        }
        return counter;
    }
}
