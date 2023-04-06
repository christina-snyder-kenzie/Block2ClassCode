package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Logger {
    //static so that I can say later:
        //Logger.save(board, fileName);

        //TicTacBoard board = Logger.load(fileName);
        /*
        {
        {null, "X", "X"},
        {null, null, "O"},
        {"O", null, "O"},
        }


         */

    /*
    "_,X,X\n_,_,O\nO,_,O\n"

    "|_|X|X|\n|_|_|O|..."

    .split("\\|")
    .split(",")
     */

    //GOAL: Save a tic tac toe baord to a file for future loading
    //Delimit the rows with newline characters
    //Delimit the data with $
        //replace nulls with _
    public static boolean save(TicTacBoard board, String fileName){
        try {
            //save the file
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String[][] grid = board.getBoard();
            //writer.write(grid);
            for (String[] row : grid){
                for (int j = 0; j < row.length; j++){
                    String currSpot = row[j];
                    if (currSpot == null){
                        currSpot = "_";
                    }
                    writer.write(currSpot);
                    writer.write(",");
                }
                writer.write("\n");
            }
            writer.close();
            return true;
        } catch (IOException e){
            System.out.println("ERROR SAVING FILE");
            return false;
        }
    }

    //GOAL: Read in a file and populate a tictacboard

    public static TicTacBoard load(String fileName){
        try {
            Path filePath = Path.of(fileName);
            String fileContents = Files.readString(filePath);
            //_,X,X,\n_,_,O,\nO,_,O,\n
            String[] rows = fileContents.split("\n");
                //{ "_,X,X," , "_,_,O," , "O,_,O," }
                //rows[0].split(",$#whatever")
                    //{ "_" , "X" , "X" }
            int sizeOfBoard = rows.length;
            TicTacBoard board = new TicTacBoard(sizeOfBoard);
            //1
            for (int i = 0; i < sizeOfBoard; i++){
                //2
                String[] data = rows[i].split(",");
                for (int j = 0; j < sizeOfBoard; j++){
                    //3
                    String currSpot = data[j];
                    if (!currSpot.equals("_")) {
                        board.makeMove(i, j, currSpot);
                    }
                }
                //4
            }
                //board.makeMove(row, col, symbol)
            return board;
        } catch(IOException e){
            System.out.println("ERROR LOADING FILE");
            return new TicTacBoard(3);
        }
    }
}
