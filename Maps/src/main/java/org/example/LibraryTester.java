package org.example;

public class LibraryTester {
    public static void main(String[] args) {
        Book b1 = new Book("Stamped from the Beginning", "Ibram Kendi", "AntiRacist", 123456);
        Book b2 = new Book("The Color of Law", "Richard Rothstein", "AntiRacist", 789321);
        Book b3 = new Book("Android Programming", "Big Nerd Ranch", "Non-Fiction", 321654);
        Book b4 = new Book("The autobiography of Abraham Lincoln", "Some guy", "Non-Fiction", 777111);
        Book b5 = new Book("The Lorax", "Dr. Suess", "Children", 555222);

        System.out.println(b1);

        Library local = new Library();
        local.buy(b1);
        local.buy(b2);
        local.buy(b3);
        local.buy(b4);
        local.buy(b5);
        System.out.println(local);

        System.out.println(local.checkStock(123456));
        System.out.println(local.checkStock(999999));

        System.out.println(local.checkStock("The Lorax"));
        System.out.println(local.checkStock("Green eggs"));

        String title = b5.getTitle();
        System.out.println(title);
        String title2 = b4.getTitle();
        System.out.println(title2);
        //System.out.println(b4.genre); ANGRY

        String newTitle = b5.combine(b4);
        System.out.println(b5);
        System.out.println(b4);

        //equals Vocabulary:
        String x = "hello";
        String y = new String("hello");

        x.equals(y); //-> true because they have the same letters
        //logical equality
        x.equals(x); // true because of reflexivity (like a mirror reflection)

        //symmetry:
        x.equals(y);
        //then
        y.equals(x);

        //Transitivity -> a.equals(b) and b.equals(c) -> then a.equals(c)
        //Consistency -> same inputs, same result

        //Non-Nullilty
        x.equals(null); //-> always returns false
        //if it's not false, it will NullPointerException

        System.out.println(b2.equals(b3));
        System.out.println(b2.equals(b2));
        System.out.println(b4.equals(b5));
    }
}
