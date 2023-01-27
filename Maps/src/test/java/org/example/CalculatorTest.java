package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //arrange
            //set up the situation
            //what objects do we need?
            //What data do we need?
            //What is the expected result?
        //act
            //do the thing we're testing
            //calling a method
        //assert
            //use assert statements to verify results
            //assertEquals(expected, actual)
            //assertTrue(boolean Condition)

        Calculator c = new Calculator();
        int a = 5;
        int b = 7;
        int expectedAnswer = 12;

        int actualAnswer = c.add(a, b);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void subtract() {
        Calculator c = new Calculator();
        int a = 17;
        int b = 7;
        int expected = 10;

        int actual = c.subtract(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
        //first test -> assert right answer
        //second test -> assert div/0 results in an error

        Calculator c = new Calculator();
        int a = 15;
        int b = 3;
        int expected = 5;

        int actual = c.divide(a, b);

        assertEquals(expected, actual);

        assertThrows(IllegalArgumentException.class, () -> {
            c.divide(a, 0);
        });
    }
}