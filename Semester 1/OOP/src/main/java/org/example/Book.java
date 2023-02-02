package org.example;

public class Book {
    //properties
    //public datatype varName;
    public String title;
    public String author;
    public int totalNumPages;
    public int pagesReadSoFar;

    //constructors

    //behaviors
    //public returnType methodName(parameters) {}

    //GOAL: write a method that will tell me if I've finished the book
    public boolean isFinished(){
        return totalNumPages == pagesReadSoFar;
    }

    //GOAL: write a read method
        //definitely: increment pagesReadSoFar
        //some kind of print statement? (Turning from page X to page Y)
    public void read(){
        if (pagesReadSoFar == 0){
            System.out.println("Opening to page 1");
            pagesReadSoFar++;
        } else {
            pagesReadSoFar++;
            System.out.println("Turning from page " + (pagesReadSoFar - 1) + " to " + pagesReadSoFar);
        }
    }

    //GOAL: Finish the book... ie, keep reading until the book is finished
    public void bingeRead(){
        while (!isFinished()){
            read();
        }
        System.out.println("You did it! " + title + " is finished!");
    }
}
