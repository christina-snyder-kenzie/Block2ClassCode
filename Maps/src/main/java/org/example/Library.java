package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<Integer, Book> inventory;

    public Library(){
        inventory = new HashMap<>();
    }

    public void buy(Book b){
        int ISBN = b.getISBN();
        inventory.put(ISBN, b);

        //inventory.put(b.getISBN(), b);
    }

    //isbn1 - title1
    //isbn2 - title2
    //isbn3 - title3
    //etc
    public String toString(){
        StringBuilder sb = new StringBuilder("Your Local Library\n");
        for (int isbn : inventory.keySet()){
            Book b = inventory.get(isbn);
            String title = b.getTitle();

            sb.append(isbn);
            sb.append(" - ");
            sb.append(title);
            sb.append("\n");
        }
        return sb.toString();
    }

    //O(1) efficiency
    //GOAL: to take an ISBN and return true or false if that book is in stock
    public boolean checkStock(int isbn){
        Book b = inventory.get(isbn);
        if (b == (null)){
         //NPE = when I call a method upon an object which is null
            return false;
        } else {
            return true;
        }
        //return b != null;
    }

    // O(n) efficiency
    //GOAL: to take in a title and return true/false if the book is in stock
    public boolean checkStock(String title){
        for (Book b : inventory.values()){
            if (b.getTitle().equals(title)){
                return true;
            }/* else {
                return false; BAD IDEA
            }*/
        }
        return false;
    }

    //the gather method
    //GOAL: return an arraylist of books that have a particular genre
    //make the arraylist
    //loop over the entrySet
        //grab the book
        //check the genre
            //toss it in
    //Efficiency: O(2)
    //The number of steps with respect to problem size
        //problem size -> n
    //O(2) -> exactly 2 steps
    //O(1) -> exactly 1 step
    //O(2) ~= O(1)

    //O(n) -> exactly n steps, where n is how many things I have

    //O(n^2) -> means n*n steps, even if I only have n things

    //Efficiency is O(n)
    public ArrayList<Book> gather(String genre){
        ArrayList<Book> books = new ArrayList<Book>();
        for (HashMap.Entry<Integer, Book> entry : inventory.entrySet()){
            Book b = entry.getValue();
            if (b.getGenre().equals(genre)){
                books.add(b);
            }
        }
        return books;
    }

}
