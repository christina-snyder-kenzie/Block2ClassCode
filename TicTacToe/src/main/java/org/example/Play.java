package org.example;

public class Play {
    private TicTacPlayer p1, p2;
    private boolean p1sTurn;
    private TicTacBoard board;

    public Play(int size){
        board = new TicTacBoard(size);
        p1 = new TicTacPlayer("X");
        p2 = new TicTacPlayer("O");
        p1sTurn = true;
    }

    //overload the constructor:
        //add another parameter: a boolean
    //If the boolean is TRUE: we have TWO computer players
    //if the boolean FALSE: we have one real player, one computer player
    public Play(int size, boolean doubleTrouble){
        if (doubleTrouble){
            p1 = new ComputerPlayer("X");
            p2 = new ComputerPlayer("O");
        } else {
            p1 = new TicTacPlayer("X");
            p2 = new ComputerPlayer("O");
        }
        board = new TicTacBoard(size);
        p1sTurn = true;
    }

    public void runGame(){
        //loop (while keep going)
        while (board.determineWinner() == Result.KEEP_GOING) {
            //determine the current player
                //Ternary Operator (?)
                //dt result = boolean question ? trueResult : falseResult;
            TicTacPlayer currentPlayer = p1sTurn ? p1 : p2;
            //display the board
            board.displayWithLabels();
            //let the current player take a turn
            currentPlayer.putOnBoard(board);
            //switch the player boolean
            p1sTurn = !p1sTurn;
        }
        board.displayWithLabels();
        //congratulate the winner
        System.out.println(board.determineWinner());
    }

    public static void main(String[] args) {
        Play game = new Play(3, true);
        game.runGame();
    }
}
