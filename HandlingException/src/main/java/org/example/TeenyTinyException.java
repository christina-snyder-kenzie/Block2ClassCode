package org.example;

public class TeenyTinyException extends RuntimeException {
    public TeenyTinyException(String tooSmall){
        super("The string " + tooSmall + " is too TEENY TINY");
    }

    public TeenyTinyException(int tooSmall){
        super("The number " + tooSmall + " is too TEENY TINY");
    }
}
