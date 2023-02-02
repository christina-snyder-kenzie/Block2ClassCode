package org.example;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate){
        //a call to super MUST happen first in a subclass constructor
        //?? okay, so then where is super?
        //the java gods call super() automatically if we don't
        super();
        System.out.println("Print A");
        this.interestRate = interestRate;
    }
    /*
    public SavingsAccount(double balance){
        //BROKEN CODE
    }
    */

    public SavingsAccount(double initialBalance, double interestRate){
        //balance = initialBalance; I don't have access
        super(initialBalance);
        System.out.println("Print D");
        this.interestRate = interestRate;
    }

    //the earnInterest method
    //increase the balance -> by how much?
        //calculates the interest (balance * interestRate)
        //adds that to my balance (balance += interest)
    public double earnInterest(){
        double interest = this.checkBalance() * interestRate;
        this.deposit(interest);
        return checkBalance();
    }

    //Saving's Balance: $$$$$, Interest Rate: XX%
    public String toString(){
        String parentsToString = super.toString();
        String myToString = "Saving's " + parentsToString + ", Interest Rate: " + (100*interestRate) + "%";
        return myToString;
    }
} //ends the savingsAccount class

class CheckingAccount extends BankAccount {
    private int maxNumWDs, countWD;

    public CheckingAccount(){
        super(200);
        maxNumWDs = 3;
        countWD = 0;
    }

    //OverRIDING the withdraw method
    //we're the changing the behavior

    //Situations:
        //1. I have enough withdrawals, and I have enough money
            //process the withdraw, and increase the counter
        //2. I have enough withdrawals, but I DON't have enough money
            //don't increase the counter, just print insufficient funds
        //3. I don't have enough withdrawals... with or without money
            //should not process it. and print a message
    public boolean withdraw(double amount){
        if (countWD < maxNumWDs){
            //I have enough withdrawals
            boolean attempt = super.withdraw(amount);
            if (attempt){
                countWD++;
            }
            return attempt;
        } else {
            //I don't have enough withdraws
            System.out.println("You have used all withdrawals for the month");
            return false;
        }
    }

    //Update toString:
    //Balance: $$$$$, X/Y withdraws used this month
    public String toString(){
        String fromBank = super.toString();
        String myToString = fromBank + ", " + countWD + "/" + maxNumWDs;
        myToString += " withdraws used this month";
        return myToString;
    }

}
