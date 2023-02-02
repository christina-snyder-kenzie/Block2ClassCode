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


}
