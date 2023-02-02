package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGameTake2 {
    public static void main(String[] args) {
        doGuessingGame();
        int answer = grabNumber("Do you want to play again? (0=no,1=yes)", 0, 1);
        while (answer == 1){
            doGuessingGame();
            answer = grabNumber("Do you want to play again? (0=no,1=yes)", 0, 1);
        }
    }

    public static void doGuessingGame() {
        System.out.println("Welcome to your guessing game!");

        //create a secret number, based on user input
        int minRange = grabNumber("Enter your minimum guess number");
        int maxRange = grabNumber("Enter your maximum guess number");
        if (maxRange < minRange){
            System.out.println("You fool! Min must be smaller than max.");
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }
        System.out.println("You will be guessing from " + minRange + " to " + maxRange);
        int secretNumber = (int) (Math.random() * (maxRange - minRange + 1) + minRange);
        //retrieve their guess
        //respond (either, correct, too high, or too low)
        //repeat guessing if they got it wrong
        ArrayList<Integer> wrongGuesses = new ArrayList<Integer>();
        boolean guessedCorrectly = false;
        //at some point, we need to set that to true... when we guess the right number
        while (!guessedCorrectly){
            //1
            if (wrongGuesses.size() == 3){
                //HINT TIME
                System.out.println("Seems like you need a hint...");
                if (secretNumber %2 == 0){
                    System.out.println("Guess an EVEN number");
                } else {
                    System.out.println("Guess an ODD number");
                }
            }
            int guess = grabNumber("Enter a guess", minRange, maxRange);
            //2 -> same as 3
            wrongGuesses.add(guess);
            //3 -> they get it right on their third guess? X
            String result = testIt(guess, secretNumber); //-> higher, lower, or correct
            //4
            if (!result.equals("correct") && wrongGuesses.size() > 3){
                int distance = Math.abs(secretNumber - guess);
                if (distance <= 2){
                    System.out.println("You're so close!");
                } else {
                    System.out.println("You're way off...");
                }
            }
            switch (result) {
                case "higher":
                    System.out.println("Too high! You need to guess lower");
                    //5 -> technically okay, but requires repeated code
                    break;
                case "lower":
                    System.out.println("Too low! You need to guess higher");
                    //5
                    break;
                case "correct":
                    System.out.println("Hooray! You got it right!");
                    if (wrongGuesses.size() == 1){
                        System.out.println("WOOOT. FIRST TRY! :)");
                    } else {
                        System.out.println("Here's how you got there: " + wrongGuesses);
                    }
                    guessedCorrectly = true;
                    break;
            }
            //6? -> after 3 guesses, but what if they got it right?
            if (!guessedCorrectly && wrongGuesses.size() >= 5){
                int answer = grabNumber("Do you want to give up? (0=no,1=yes)");
                if (answer == 1){
                    //break; -> should end the loop
                    return; //-> ends the whole method
                    //guessedCorrectly = true; -> end the loop
                }
            }

        }
    }

    //IDEAS for bells & whistles
        //1. Be sure that we get a number in grabNumber
            //Secret joke: if they enter '#' -> yeah yeah, we get it... it's a number...

    //to-DONE list
    //4. Check that min < max at the very beginning
    //2. Be sure the user is guessing within the range
    //5. Count the number of guesses / collect all the guesses so far
    //3. Give a hint: (number is even or odd)
    //7. Play again
    //6. Give up feature -> after X guesses

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

    public static int grabNumber(String prompt, int min, int max){
        //GOAL: retreive user input, and verify that it's between min and max
            //if it's outside the range: warn/insult them, remind them of the min/max\
                //guess again!

        //first question
        int guess = grabNumber(prompt);
        while (guess < min || guess > max){
            //while it's a bad answer,
            //repeatedly ask
            System.out.println("Please enter a guess between " + min + " and " + max);
            guess = grabNumber("Enter another number!");
        }
        return guess;
    }


}
