package org.example;

import java.util.ArrayList;

public class Theater {
    public static void main(String[] args) {
        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Dan");
        characters.add("Ruthie");
        characters.add("Mitch");
        Movie m = new Movie("Dan in Real Life", "Romantic Comedy", 2007, characters);
        System.out.println(m.getCast());

        //arrange
            //set everything up- make variables
        //act
            //do the thing you're trying to test (call the method)
        //assert
            //verify that the result is what you expected

        String title = m.getTitle();
        System.out.println(title);
        System.out.println(m);
        System.out.println(m.hire("Dan", "Steve Carrell"));
        System.out.println(m.hire("Nemo", "Fish #1"));
        System.out.println(m.hire("Ruthie", "Emily Blunt"));
        System.out.println(m);
    }
}