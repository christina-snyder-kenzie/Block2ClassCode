package org.example;

public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book();
        //it sets all properties to their DEFAULT values
        // (0, 0.0, false, null, null)
        b1.title = "The color of law";
        b1.author = "Richard Rothstein";
        b1.totalNumPages = 342;
        b1.pagesReadSoFar = 25;

        System.out.println(b1.title);

        b1.read();
        //System.out.println(b1.read()); Not needed, because method does the printing

        for (int i = 0; i < 10; i++){
            b1.read();
        }
        b1.bingeRead();

        Book kidsBook = new Book();
        kidsBook.title = "The Lorax";
        kidsBook.author = "Dr. Suess";
        kidsBook.totalNumPages = 25;
        kidsBook.pagesReadSoFar = 0;

        kidsBook.bingeRead();

    }
}
