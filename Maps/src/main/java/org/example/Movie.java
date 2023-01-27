package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Movie {
    private String title, genre;
    private int year;
    private HashMap<String, String> cast;

    public Movie(String title, String genre, int year, ArrayList<String> characters){
        this.title = title;
        this.genre = genre;
        this.year = year;
        cast = new HashMap<>();
        for (int i = 0; i < characters.size(); i++){
            String character = characters.get(i);
            cast.put(character, "?");
        }
    }

    //GOAL: write a method to get the cast
    public HashMap<String, String> getCast(){
        return cast;
    }

    //getters and setters
    //getter -> public dt getVar() {return var;}
    public int getYear(){
        return year;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    //setter -> public void setVar(dt newVar) {this.var = newVar;}
    public void setYear(int newYear){
        this.year = newYear;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    //toString
    /*
    title
        genre
        year
    character1< played by actor1>
    character2< played by actor2>
    etc
     */
    public String toString(){
        //1. grab title/genre/year
        StringBuilder sb = new StringBuilder(title);
        sb.append("\n\t");
        sb.append(genre);
        sb.append("\n\t");
        sb.append(year);
        //2. Loop over the keyset
        for (String character : cast.keySet()) {
            //3. grab character
            sb.append("\n");
            sb.append(character);
            //4. potentially grab the actor
            String actor = cast.get(character);
            if (!actor.equals("?")){
                sb.append(" played by ");
                sb.append(actor);
            }
        }
        return sb.toString();
    }

    //equals
    //transitivity -> if a == b, b == c, then a == c
    //reflexivity -> a == a, because its my reflection
    //non-nullity -> a == null is always false
    //symmetry -> a == b, then b == a
    //logical equality -> means we look at data for equality
    //consistency -> we always get the same answer with the same inputs

    //do a reflexivity test (this == other)
    //do a non-nullity test (other == null)
    //do a class test (other instanceof Class)
    //do a logical equality test
        //requires a type-cast to see the data
        //movies -> title, genre, year, cast
            //remakes are considered equal (so, we won't check year or actors)
            //title, genre, and characters must match
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (other == null){
            return false;
        }
        if (! (other instanceof Movie)){
            return false;
        }
        //type-cast
        Movie otherMovie = (Movie) other;

        return this.title.equals(otherMovie.title) &&
                this.genre.equals(otherMovie.genre) &&
                this.cast.keySet().equals(otherMovie.cast.keySet());
    }

    //hire
    //GOAL: Inputs: Character and an actor
    //if the character is not in the movie, return false
        // !cast.containsKey(character)
    //if we haven't hired for that character, we will employ the actor and return true
        // cast.get(character).equals(?)
    //if have already hired, we return false
        //else statement...

    //looking up things with .get
    public boolean hire(String character, String actor){
        if (!cast.containsKey(character)){
            return false;
        } else if (cast.get(character).equals("?")){
            cast.replace(character, actor);
            return true;
        } else {
            //we've already hired
            return false;
        }
    }

    //fire
    //Input: The character name
    //If the character is not in the movie, return null
    //If the character has not been hired yet, return ""
    //If the character has been hired, fire them and return the actor's name
        //firing means set the value back to ?
    public String fire(String character){
        String actor = cast.get(character);
        if (actor == null){
            return actor;
        } else if (actor.equals("?")){
            return "";
        } else {
            //grab actors name
            //fire them
            cast.replace(character, "?");
            //return actor's name
            return actor;
        }
    }

}
