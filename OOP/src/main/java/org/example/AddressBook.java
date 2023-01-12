package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Entry> entries;

    public AddressBook(){
        entries = new ArrayList<Entry>();
    }

    public void add(Person p, String r){
        Entry toAdd = new Entry(p, r);
        entries.add(toAdd);
    }

    public void add(Person p, Address a, String r){
        entries.add(new Entry(p, a, r));
    }

    public void add(){
        //handling optional data
        //option1: ask the question: do you have X info?
            //they'll say yes/no, if yes -> we retrieve the answer
        //option2: Enter X info, or type "none" if you don't have it
            //and then we deal with "none" if necessary

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter " +firstName+"'s DOB. If unknown, leave blank and press enter: ");
        String DOB = scan.nextLine();
        System.out.println("Enter their email, or leave blank if unknown, then press enter: ");
        String email = scan.nextLine();
        System.out.println("Enter their phone number, or leave blank if unknown, then press enter: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter their job title, or leave blank if unknown, then press enter: ");
        String job = scan.nextLine();

        Person p = null;

        //3 constructors:
            //one with all -> How do I know if I can use this constructor?
        if (DOB.length() > 0 && email.length() > 0 && phoneNumber.length() > 0 && job.length() > 0){
            //here, NONE are empty
            p = new Person(firstName, lastName, DOB, email, phoneNumber, job);
        }
            //one with name + number
        else if (phoneNumber.length() > 0){
            p = new Person(firstName, lastName, phoneNumber);
        }
            //one with only name
        else {
            p = new Person(firstName, lastName);
        }

        //TODO: Address the address

        System.out.print("How do you know this person? Enter your relationship: ");
        String relationship = scan.nextLine();

        System.out.print("Do you know their address? (Type Y/N)");
        String addressAnswer = scan.nextLine();
        if (addressAnswer.equalsIgnoreCase("N")){
            Entry e = new Entry(p, relationship);
            entries.add(e);
        } else {
            System.out.print("Enter the house number: ");
            int houseNum = Integer.parseInt(scan.nextLine());
            System.out.print("Enter the street: " );
            String street = scan.nextLine();
            System.out.print("Do they have a unit number? (Type Y/N): ");
            String unitAnswer = scan.nextLine();
            String unit = "";
            if (unitAnswer.equalsIgnoreCase("Y")){
                System.out.print("Unit: ");
                unit = scan.nextLine();
            }
            System.out.println("Type City, State, Zip all on their own lines");
            String city = scan.nextLine();
            String state = scan.nextLine();
            String zip = scan.nextLine();

            Address a;
            if (unitAnswer.equalsIgnoreCase("Y")){
                a = new Address(houseNum, street, unit, city, state, zip);
            } else {
                a = new Address(houseNum, street, city, state, zip);
            }

            entries.add(new Entry(p, a, relationship));

        }

    }

    public ArrayList<String> gatherByRelationship(String toTest){
        //GOAL:Return an array list of first names
            //where the relationship is the one provided
        //init
        ArrayList<String> names = new ArrayList<String>();
        //loop
        for (Entry e : entries){
            //if statement -> the current entry has the right relationship
            if (e.getRelationship().equals(toTest)) {
                //update
                String firstName = e.getFriend().getFirst();
                names.add(firstName);
            }
        }
        return names;
    }

    public ArrayList<String> gatherByState(String targetState){
        //GOAL: gather all first names whose address contains the target state
        ArrayList<String> names = new ArrayList<String>();
        for (Entry e : entries){
            if (e.getLocation() != null) {
                String state = e.getLocation().getState();
                if (state.equals(targetState)) {
                    String firstName = e.getFriend().getFirst();
                    names.add(firstName);
                    //names.add(e.getFriend().getFirst());
                }
            }
        }
        return names;
    }

    public String toString(){
        /*
        *********
        entry1
        *********
        entry 2
        *********
         */
        StringBuilder sb = new StringBuilder("********");
        for (Entry e : entries){
            sb.append("\n");
            sb.append(e);
            sb.append("\n********");
        }
        return sb.toString();
    }

}

class Entry {
    private Person friend;
    private Address location;
    private String relationship;

    public Entry(Person friend, String relationship){
        this.friend = friend;
        this.relationship = relationship;
        location = null;
    }

    public Entry(Person friend, Address location, String relationship) {
        this.friend = friend;
        this.location = location;
        this.relationship = relationship;
    }

    public Person getFriend() {
        return friend;
    }

    public String getRelationship() {
        return relationship;
    }

    public Address getLocation(){
        return location;
    }

    /*
        Name: Christina Snyder
        DOB: 03/31/1992
        Phone Number: (678)123-4567
        Email: christina.snyder@kenzie.academy
        Job Title: SME
        --------
        3550 Old Path Crossing
        Suwanee, GA 30004
        --------
        Teacher

        Name: Michael Meacham
        Phone Number: (770)464-4321
        -------
        Facilitator

         */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(friend);
        sb.append("\n-------");
        if (location != null){
            sb.append("\n").append(location);
            sb.append("\n-------");
        }
        sb.append("\n").append(relationship);
        return sb.toString();
    }

}