package org.example;

import java.util.ArrayList;
import java.util.List;

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

        Address childHoodHome = new Address(3550, "Old Path Crossing", "Suwanee", "GA", "30004");
        Address collegeApt = new Address(627, "Akers Ridge Dr", "908", "Atlanta", "GA", "30318");
        System.out.println(childHoodHome);
        System.out.println(collegeApt);

        Entry e1 = new Entry(p1, childHoodHome, "Teacher");
        Entry e2 = new Entry(p2, "Facilitator");

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("----------Begin AddressBook-----------");
        AddressBook book = new AddressBook();
        book.add(p1, childHoodHome, "Teacher");
        book.add(p2, "Facilitator");
        book.add(p3, collegeApt, "Teacher");
        book.add();
        System.out.println(book);

        ArrayList<String> teachers = book.gatherByRelationship("Teacher");
        System.out.println(teachers);

        ArrayList<String> georgians = book.gatherByState("GA");
        System.out.println(georgians);


    }
}
