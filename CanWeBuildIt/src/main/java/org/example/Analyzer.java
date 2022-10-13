package org.example;

import java.util.*;

public class Analyzer {
    public static void main(String[] args) {
        //GOAL: to collect numbers from a user
            //ask for a number
            //put it in a structure
        //until the user says "quit"
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter your numbers, or type 'quit' to stop");
        //loop and a half
//        String response = "";
//        while (!response.equals("quit")){
//            response = scan.nextLine();
//            //response could be a number, or it could be quit
//            if (!response.equals("quit")){
//                numbers.add(Integer.parseInt(response));
//            }
//        }

        //Christina's Way:
        String response = scan.nextLine();
        while (!response.equals("quit")){
            numbers.add(Integer.parseInt(response));
            response = scan.nextLine();
        }
        System.out.println(numbers);

        int maximum = findMax(numbers);
        System.out.println("The max is: " + maximum);

    }

    //Code 2 or 3 of these methods:
    //1. findMax
    public static int findMaxIndex(ArrayList<Integer> list){
        //init
        int max = list.get(0);
        int index = 0;
        //loop
        for (int i = 0; i < list.size(); i++){
            //compare
            if (list.get(i) > max) {
                //update
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
    //2. calculateAverage
    public static double calculateAverage(ArrayList<Integer> list){
        //init sum
        double sum = 0;
        //loop
        for (int number : list){
            //calc sum
            sum += number;
        }
        //calc average
        return sum / list.size();
    }
    //3. findPositionOfMinimum
}
