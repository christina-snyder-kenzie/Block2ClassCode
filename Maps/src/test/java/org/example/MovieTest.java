package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void getTitle() {
        //arrange
        Movie m = new Movie("Titanic", "Sad One", 1997, new ArrayList<>());
        String expectedResult = "Titanic";
        //act
        String actualTitle = m.getTitle();
        //assert
            //(Means to verify that the result is what you expected)
            //unit tests have built in assert statements you can use
        assertEquals(expectedResult, actualTitle);
    }

    @Test
    void testSetTitle() {
        //arrange
        Movie m = new Movie("Titanic", "Sad One", 1997, new ArrayList<>());
        String newTitle = "Marley and Me";

        //act
        m.setTitle(newTitle);
        String updatedTitle = m.getTitle();

        //assert
        assertEquals(newTitle, updatedTitle);
    }
}