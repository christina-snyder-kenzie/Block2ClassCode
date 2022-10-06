package org.example;

import java.util.Scanner;

public class GuessingGameTake2 {
    public static void main(String[] args) {
        System.out.println("Welcome to your guessing game!");

        //create a secret number, based on user input
        int minRange = grabNumber("Enter your minimum guess number");
        int maxRange = grabNumber("Enter your maximum guess number");
        System.out.println("You will be guessing from " + minRange + " to " + maxRange);
        int secretNumber = (int) (Math.random() * (maxRange - minRange + 1) + minRange);
        //retrieve their guess
        //respond (either, correct, too high, or too low)
        //repeat guessing if they got it wrong

        boolean guessedCorrectly = false;
        //at some point, we need to set that to true... when we guess the right number
        while (!guessedCorrectly){
            int guess = grabNumber("Enter a guess");
            String result = testIt(guess, secretNumber); //-> higher, lower, or correct
            switch (result) {
                case "higher":
                    System.out.println("Too high! You need to guess lower");
                    break;
                case "lower":
                    System.out.println("Too low! You need to guess higher");
                    break;
                case "correct":
                    System.out.println("Hooray! You got it right!");
                    guessedCorrectly = true;
                    break;
            }
        }
    }

    //IDEAS for bells & whistles
        //1. Be sure that we get a number in grabNumber
            //Secret joke: if they enter '#' -> yeah yeah, we get it... it's a number...
        //2. Be sure the user is guessing within the range
        //3. Give a hint: (number is even or odd)
        //4. Check that min < max at the very beginning
        //5. Count the number of guesses / collect all the guesses so far
        //6. Give up feature -> after X guesses
        //7. Play again


    public static String testIt(int guess, int rightAnswer){
        if (guess > rightAnswer){
            return "higher";
        } else if (guess < rightAnswer){
            return "lower";
        } else {
            return "correct";
        }
    }


    //GOAL: to retrieve a number from the user, given a prompt
    public static int grabNumber(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        int response = scan.nextInt();
        return response;
    }


}
