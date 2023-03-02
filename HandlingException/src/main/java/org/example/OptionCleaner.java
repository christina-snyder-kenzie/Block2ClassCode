package org.example;

import java.util.Scanner;

public class OptionCleaner {
    //GOAL: Use a scanner to receive an option
        //that option must be yes or no
    //if they give us anything else, we must throw a custom
        //IllegalOptionException
    //we should catch that error and tell the user to say yes or no
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your input:");
        String input = scan.nextLine();
        boolean result; //true if they entered yes, false if they entered no
        try {
            //do a length check first. If the length is less than 2, throw
                //a teeny tiny exception
            //and then catch that
            if (input.equals("yes")){
                result = true;
            } else if (input.equals("no")){
                result = false;
            } else {
                //ERROR
                throw new IllegalOptionException();
            }
        } catch (IllegalOptionException e){
            System.out.println(e.getMessage());
            System.out.println("Please say yes or no");
        }
    }
}


class IllegalOptionException extends RuntimeException{
    public IllegalOptionException(){
        super("That option is illegal!");
    }
}