package org.example;

import java.util.Arrays;

public class ArraysIn2D {
    public static void main(String[] args) {
        int[][] arr = { {7, 5, 3, 8} ,
                        {3, 2, 4, 6} };
        int numRows = arr.length;
        System.out.println(numRows);
        int numCols = arr[0].length;
        System.out.println(numCols);
        System.out.println(Arrays.toString(arr));
        printOut(arr);
        System.out.println(sumUp(arr));
        System.out.println(avg(arr));
        System.out.println(findMax(arr));
        System.out.println(sumRow(arr, 0));
        System.out.println(sumRow(arr, 1));

        for (int j = 0; j < numCols; j++){
            System.out.print(sumCol(arr, j) + ", ");
        }
        System.out.println();
        System.out.println(sumAround(arr, 0, 0));

        int[][] board = new int[5][5];
        board[1][1] = -1;
        board[0][3] = -1;
        board[2][3] = -1;
        board[4][0] = -1;

        printOut(board);
    }

    public static void fillInBoard(int[][] board){
        //loop
            //if I'm not a bomb
                //count how many around me
               // board[i][j] = countBombsAround(board, i, j);
                //put that number in the donut

    }

    public static int countBombsAround(int[][] board, int rowSpot, int colSpot){
        return 0;

    }

    //GOAL: Given a row, col index
    //sum the values AROUND that index
    public static int sumAround(int[][] arr2, int row, int col){
        int basket = 0;
        for (int r = row - 1; r <= row + 1; r++){
            for (int c = col - 1; c <= col + 1; c++){
                try {
                    //de morgan's law
                    //when you reverse a boolean expression, you reverse the
                    //conjunction (and/or)
                    if (r != row || c != col){
                        basket += arr2[r][c]; //DANGER ZONE
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    //do nothing?
                    System.out.println("Along the edge!");
                } //ends the catch
            } //ends the col loop
        }//ends the row loop
        return basket;
    } //ends the method

    //GOAL: sum a particular column
    public static int sumCol(int[][] arr2D, int colIndex){
        int basket = 0;
        for (int[] row : arr2D){
            int dude = row[colIndex];
            basket += dude;
        }
        return basket;
    }

    //GOAL: to sum a particular row
    //inputs: an array, and a rowIndex
    public static int sumRow(int[][] arr2D, int rowIndex){
        int basket = 0;
        //loop over the columns
        for (int colIndex = 0; colIndex < arr2D[rowIndex].length; colIndex++){
            int dude = arr2D[rowIndex][colIndex];
            basket += dude;
        }
        return basket;
    }

    /*
    dt[] arr = {values};
    for (dt thing : arr){
        //do stuff with thing...
    }

    dt[][] arr2d = { {row1}, {row2}, {row3} };
    for (dt[] row : arr2D){
        for (dt thing : row){
            //do stuff with thing...
        }
    }
     */

    //GOAL: Use forEach to find the Max
    public static int findMax(int[][] arr2D){
        int max = arr2D[0][0];
        for (int[] row : arr2D){
            for (int dude : row ){
                if (dude > max){
                    max = dude;
                }
            }
        }
        return max;
    }

    //GOAL: Average the array, return the avg
    //what is an average?
    //sum / number of numbers
    public static double avg(int[][] arr2D){
        //sum
        int sum = sumUp(arr2D);
        //numRows
        int numRows = arr2D.length;
        //numCols
        int numCols = arr2D[0].length;
        //TotalElements
        int totalNumElements = numCols*numRows;
        return (double) sum / totalNumElements;

        //return (double) sumUp(arr2D) / (arr2D.length * arr2D[0].length);
    }

    //GOAL: SumUP the array, return the total
    public static int sumUp(int[][] arr2D){
        int basket = 0;
        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[0].length; j++){
                basket += arr2D[i][j];
            }
        }
        return basket;
    }


    //GOAL: Write a method to print out a 2D array of ints
    //in a grid => tabular form
    public static void printOut(int[][] arr2D){
        for (int rowIndex = 0; rowIndex < arr2D.length; rowIndex++){
            for (int colIndex = 0; colIndex < arr2D[rowIndex].length; colIndex++){
                System.out.print(arr2D[rowIndex][colIndex] + ", ");
            }//ends my col loop
            System.out.println();
        }//ends my row loop
    }
}
