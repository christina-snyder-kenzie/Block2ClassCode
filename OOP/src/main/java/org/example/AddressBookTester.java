package org.example;

public class AddressBookTester {
    public static void main(String[] args) {
        Person p1 = new Person("Christina", "Snyder", "03/31/1992", "christina.snyder@kenzie.academy", "(678)123-4567", "SME");
        Person p2 = new Person("Michael", "Meacham", "(770)464-4321");
        Person p3 = new Person("Willie", "Nelson");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.getAge(2022));
        System.out.println(p2.getAge(2022));
        p2.setDOB("04/30/1992");
        System.out.println(p2.getAge(2022));




    }
}
