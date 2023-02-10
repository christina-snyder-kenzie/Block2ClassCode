package org.example;

public enum CreditScore {
    BAD (300),
    OKAY(450),
    GOOD(600),
    EXCELLENT(750);

    private int numberScore;

    private CreditScore(int numberScore){
        this.numberScore = numberScore;
    }

    public int getNumberScore(){
        return numberScore;
    }
}
