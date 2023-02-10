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
//is-a relationship (inheritance)
        //a savings account is a bank account
//has-a relationship (composition)
        //a bank account has a balance
        //a savings account has a interest rate
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


        BankAccount account1 = new BankAccount(20);
        BankAccount account2 = new BankAccount(50);
        boolean result = account1.transfer(account2, 10);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(result);


        //savings accounts ARE bank accounts
        BankAccount weird = new SavingsAccount(400, 0.05);
        weird.deposit(100);
        System.out.println(weird.checkBalance());
        //polymorphism
        //many change
        //A subclass can be classified by a data type of its super class
        //weird.earnInterest(); Can't do this when wearing a bank account jacket
        System.out.println(weird.toString());
        //when I can do a more specific thing, I do the more specific thing

        //What if I REALLY WANTED to earn interest though?
        //we can remove the jacket!
        //it's type-casting (newDataType)
        SavingsAccount theRealOne = (SavingsAccount) weird;
        theRealOne.earnInterest();
        System.out.println(theRealOne);

        BankAccount superWeird = theRealOne;
        Object topLevel = superWeird;
        System.out.println(topLevel.toString());
        //topLevel.deposit(50); No deposit armhole in the object jacket

        BankAccount bank1 = new BankAccount(50);
        SavingsAccount savings1 = new SavingsAccount(50, 0.1);
        boolean result1 = bank1.transfer(savings1, 20);
        System.out.println(bank1);
        System.out.println(savings1);
        System.out.println(result1);

        CheckingAccount checking1 = new CheckingAccount();
        System.out.println(checking1);
        for (int i =0; i < 10; i++){
            checking1.transfer(bank1, 10);
        }
        System.out.println(bank1);
        System.out.println(checking1);

        System.out.println("First number: " + b1.getAccountNumber());
        System.out.println("last used: " + BankAccount.getLastAccountNumberUsed());
    }
}
