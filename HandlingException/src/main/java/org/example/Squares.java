package org.example;

import java.io.*;
import java.util.concurrent.TimeoutException;

public class Squares {
    public static void main(String[] args) {
        //GOAL: is to take an array of numbers, and print them to a file:
        // {7, 5, 1, 3, 8}
        /*
        7 squared is 49
        5 squared is 25
        1 squared is TOO SMALL
        3 squared is TOO SMALL
        8 squared is 64
         */

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("squaresFile.txt"));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        writer.println("hello, world!");

        int[] numbers = {7, 5, 1, 3, 8};
        //here? 1
        for (int num : numbers){
            //here? 2
            String toPrint = "";
            try {
                int square = num * num; //num *= num;
                //throw a teeny tiny error if the square is less than 10
                if (square < 10) {
                    throw new TeenyTinyException(square);
                }
                //writer.println(num + " squared is " + square);
                toPrint += square;
            } catch (TeenyTinyException e){
               // writer.println(num + " squared is TOO SMALL");
                toPrint += "TOO SMALL";
            } finally {
                writer.println( num + " squared is " + toPrint);
            }
        }

        writer.close();

    }
}
