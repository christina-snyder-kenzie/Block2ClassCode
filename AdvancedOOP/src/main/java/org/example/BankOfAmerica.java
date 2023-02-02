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

        for (int i = 0; i < 10; i++) {
            s1.earnInterest();
        }
        System.out.println(s1);

        //what would my balance be after 10 years?
        //if I compound annually

        System.out.println("------------");
        CheckingAccount c1 = new CheckingAccount();
        System.out.println(c1);

        //Can I withdraw $500 5 times?
        for (int i = 0; i < 5; i++){
            System.out.println(c1.withdraw(500));
        }
        System.out.println(c1);

        //After I attempt to WD $500 5 times
        //Can I then withdraw $10 once?
        System.out.println(c1.withdraw(10));
        System.out.println(c1);


    }
}
