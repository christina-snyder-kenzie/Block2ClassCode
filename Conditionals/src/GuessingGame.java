import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Math.random() -> a double between 0 and 1
                        //the zero is included, but the 1 is excluded
                        //the biggest number I could get is really .9999
        int secretNumber = (int) (Math.random() * 10);
        //so now secretNumber is between 0 and 9
        System.out.print("Enter a number between 0 and 9: ");
        //"7"
        //Integer.parseInt("7") -> the int 7
        int guess = Integer.parseInt(scan.nextLine());
        if (guess == secretNumber){
            System.out.println("You got it right! First Try! Amazing!");
        } else {
            if (guess < secretNumber) {
                //same as secretNumber > guess
                System.out.println("You need to guess Higher!");
            } else {
                //guess MUST BE greater than secretNumber
                System.out.println("Too high! Guess lower.");
            } //ends my little else
            System.out.print("Guess again. Enter a number from 0 to 9: " );
            guess = Integer.parseInt(scan.nextLine());

            if (guess == secretNumber){
                System.out.println("You got it right on the second try!");
            } else {
                if (guess > secretNumber){
                    System.out.println("Too high! Guess lower.");
                } else {
                    System.out.println("Too low! Guess higher");
                }

                System.out.print("Last try! Pick a number between 0 and 9: ");
                guess = Integer.parseInt(scan.nextLine());
                if (guess == secretNumber){
                    System.out.println("Just in time! You got it right!");
                } else {
                    System.out.println("You got it wrong again. The number is: " + secretNumber);
                } //baby else

            } //nested else

        } //ends the BIG else


    } // ends the main method
} //ends the file
