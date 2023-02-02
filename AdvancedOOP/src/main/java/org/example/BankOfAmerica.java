package org.example;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        System.out.println(b1.checkBalance());

        System.out.println(b1.withdraw(700));
        System.out.println(b1.checkBalance());

        System.out.println(b1.withdraw(700));
        System.out.println(b1.checkBalance());

        System.out.println(b1.toString());

        SavingsAccount s1 = new SavingsAccount(0.025);
        s1.deposit(500);
        System.out.println(s1.checkBalance());
        System.out.println(s1.withdraw(200));
        System.out.println(s1);

    }
}
