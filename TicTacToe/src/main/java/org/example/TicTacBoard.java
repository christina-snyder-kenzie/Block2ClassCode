package org.example;

public class TicTacBoard {
    //props
    private String[][] grid;
    //constructors
        //public ClassName(dt1 param1, dt2 param2, etc){initialize}
    public TicTacBoard(int size){
        grid = new String[size][size];
    }
    //methods (getters/setters/and others)
    public int getSize(){
        return grid.length;
    }

    public String[][] getBoard(){
        return grid;
    }

    //GOAL: Take in row, col, symbol, put it in the grid
    //What if row/col are OOB?
        //That's the job of the runner/player
    //What if there is already a symbol at row/col?
        //WE THROW a SpotsTaken exception -> should trigger loss of turn
    //Whose job is it to test those things?

    /*
    We create an isValidSpot(row, col) -> returns a boolean
    When a player is asked for their spot, we check it with isValidSpot()
        Valid => in bounds
        While (!Valid) -> keep asking

    Precondition: that the row/col is valid

    I kinda want to throw an SpotsTaken exception
     */

    public void makeMove(int row, int col, String symbol){
        if (grid[row][col] == null){
            grid[row][col] = symbol;
        } else {
            throw new SpotsTakenException(row, col, grid[row][col]);
        }
    }

    public void displayWithLabels(){
        System.out.print("   ");
        for (int i = 0; i < grid.length; i++){
            System.out.print(i + " ");
        }

        //System.out.println("*******");
        System.out.println();
        int counter = 0;
        for (String[] row : grid){
            System.out.print(counter++);
            System.out.print(" |");
            for (String spot : row){
                if (spot == null){
                    System.out.print("_" + "|");
                } else {
                    System.out.print(spot + "|");
                }

            }
            System.out.println();
        }
        //System.out.println("*******");
    }

    public Result determineWinner(){
        //X == player 1
        //O == player 2

        for (int i = 0; i < grid.length; i++){ //row-major , we're going across
            //squeeze in our inits
            int countX = 0;
            int countO = 0;
            for (int j = 0; j < grid.length; j++){
                String spot = grid[i][j];
                //short-circuiting
                    //if it is impossible to be true, we stop with and
                //false && something -> always false

                    //with or, if the first thing is true, we don't need to look at the second
                //true || anything -> always true
                if (spot != null && spot.equals("X")){
                    countX++;
                } else if (spot != null && spot.equals("O")){
                    countO++;
                }
            }
            //check for winners
            if (countX == grid.length){
                return Result.P1_WINS;
            } else if (countO == grid.length){
                return Result.P2_WINS;
            }
        }

        //COLUMN CHECKER
        for (int j = 0; j < grid.length; j++){
            //squeeze in our inits
            int countX = 0;
            int countO = 0;
            for (int i = 0; i < grid.length; i++){
                String spot = grid[i][j];
                //short-circuiting
                //if it is impossible to be true, we stop with and
                //false && something -> always false

                //with or, if the first thing is true, we don't need to look at the second
                //true || anything -> always true
                if (spot != null && spot.equals("X")){
                    countX++;
                } else if (spot != null && spot.equals("O")){
                    countO++;
                }
            }
            //check for winners
            if (countX == grid.length){
                return Result.P1_WINS;
            } else if (countO == grid.length){
                return Result.P2_WINS;
            }
        }

        //DIAGONAL CHECKER
        //MAJOR
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < grid.length; i++){
            String spot = grid[i][i];
            if (spot != null){
                if (spot.equals("X")){
                    countX++;
                } else if (spot.equals("O")){
                    countO++;
                }
            }
        }
        if (countX == grid.length){
            return Result.P1_WINS;
        } else if (countO == grid.length){
            return Result.P2_WINS;
        }

        //MINOR
        countX = 0;
        countO = 0;
        for (int i = 0; i < grid.length; i++){
            String spot = grid[i][grid.length - i - 1];
            if (spot != null){
                if (spot.equals("X")){
                    countX++;
                } else if (spot.equals("O")){
                    countO++;
                }
            }
        }
        if (countX == grid.length){
            return Result.P1_WINS;
        } else if (countO == grid.length){
            return Result.P2_WINS;
        }

        for (String[] row:grid){
            for (String spot : row){
                if (spot == null){
                    return Result.KEEP_GOING;
                }
            }
        }
        return Result.TIE;
    }

    public static void main(String[] args) {
        TicTacBoard board = new TicTacBoard(3);
        /*board.makeMove(0, 0, "X");
        board.makeMove(0, 1, "O");
        //board.makeMove(0, 2, "X");

         */
        System.out.println(board.getBoard()[0][0]);
        board.makeMove(0, 2, "O");
        board.makeMove(1, 1, "O");
       // board.makeMove(2, 0, "O");
        System.out.println(board.getBoard()[1][0]);
        board.displayWithLabels();
        System.out.println(board.determineWinner());

        Logger.save(board, "save.txt");

        System.out.println("---ABOUT TO LOAD---");
        TicTacBoard loaded = Logger.load("save.txt");
        loaded.displayWithLabels();
        loaded.makeMove(0, 0, "X");
        loaded.displayWithLabels();
    }

}
