package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
        System.out.println("Print C");
    }

    //overLOAD the constructor
    //overLoading => means different parameters
    public BankAccount(){
        this(0);
        System.out.println("Print B");
    }

    //method prerequisites:
    //what is the method doing?
    //What does the method need? (parameters)
    //what does the method return? (datatype)

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double checkBalance(){
        return balance;
    }

    public boolean withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient Funds... you're broke...");
            return false;
        } else {
            //they have enough money...
            balance -= amount;
            return true;
        }
    }

    //OverRIDEing
    //Borrowing/Updating the method from the parent class
    //the SAME method, parameters, return types, method name, everything
    //We get to change the insides
    public String toString(){
        return "Balance: $" + balance;
    }
}
