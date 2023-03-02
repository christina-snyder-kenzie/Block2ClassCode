package org.example;

import java.util.List;

public class MonopolyGame {
     private List<Player> players;
     private int currPlayerIndex;

    //TODO: Make constructor
    //        TakeATurn()
    public void takeATurn(){

//        Become the active player
        Player activePlayer = players.get(currPlayerIndex);
//        RollDice()
        int result = activePlayer.rollDice();
//        UpdatePosition()
        int newPos = activePlayer.getPosition() + result;
//          (Do the wraparound, passGo if needed)
        int numOfProperties = Bank.getInstance().getNumProperties();
        while (newPos >= numOfProperties){
            //we gotta wraparound
            activePlayer.passGo();
            newPos -= numOfProperties;
        }
        activePlayer.setPosition(newPos);
//        See where we landed
        Property landed = Bank.getInstance().getProperty(newPos);
//        ASK: is it owned?
        if (landed.isOwned()){
            //            Yes->payRent
            activePlayer.payRentTo(landed.getOwner(), landed.calcRent());
        } else{
            //Buy it
            //              No->Buy
            //TODO: Code BUY PRoperties from bank
        }


//        (UpgradeProperties/BuyHouses/Hotels?)

//        Pass the turn/Advance the currentPlayer
        currPlayerIndex++;
    }
}
