package org.example;

import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class FileIntro {
    public static void main(String[] args) {
        //theEasyWay();
        try {
            theHardWay();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void theHardWay() throws FileNotFoundException , IOException{
        //works with streams of data
        //1. String fileName
        //2. FileInputStream
        //3. InputStreamReader
        //4. BufferedReader
        //5. CLOSE THE FILE
        String fileName = "words.txt";
        FileInputStream inputStream = new FileInputStream(fileName); //makes the river of data
        InputStreamReader inputReader = new InputStreamReader(inputStream); //is like a data vaccuum
        BufferedReader reader = new BufferedReader(inputReader); //waits for the vaccuum to hit a newline character

        String line = reader.readLine();
        int numLines = 0;
        int numWords = 0; // numWords += line.split(" ").length
        ArrayList<String> lines = new ArrayList<>();
        while (line != null){
            //1
            numLines++;
            //2
            numWords += line.split(" ").length;
            System.out.println(line);
            //3
            lines.add(line);
            line = reader.readLine();
            //4 WRONG PLACE, here we have the NEXT line (we don't know if it's null or not..)
        }
        System.out.println(numLines + " lines");
        System.out.println(numWords + " words");

        //I want to put all the data in a 2D array
        //dt[][] arr2D = new dt[numRows][numCols];
        int numRows = numLines;
        int numCols = numWords/numLines;

        String[][] words = new String[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            String currLine = lines.get(i);
            String[] currLineData = currLine.split(" ");
            for (int j = 0; j < currLineData.length; j++){
                // where I'm going <= what I have
                String currWord = currLineData[j];
                words[i][j] = currWord;
            }
        }
        printOut(words);
        writeTranslations(words);

        reader.close();
    }

    public static void writeTranslations(String[][] words){
        //to write to a file
        //1. new file name
        //2. FileWriter
        //3. BufferedWriter
        try {
            String fileName = "translatedWords.txt";
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int j = 0; j < words[0].length; j++){
                for (int i =0; i < words.length; i++){
                    //if we're not the last one
                        writer.write(words[i][j] + " ");
                    //else
                        //print without a space
                }
                //if we're not the last one
                    writer.write("\n");
            }
            writer.close();
        } catch (IOException e){
            System.out.println("Something went wrong");
        }

    }

    public static void printOut(String[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + "\t"); //do print so that the row is on the same line
            }
            System.out.println();
        }
    }

    public static void theEasyWay() {
        //The easy way:
            //1. Find the file/make a path
            //2. Read the file
        String fileName = "words.txt";
        Path filePath = Path.of(fileName);
        String fileContents = "";
        try {
            fileContents = Files.readString(filePath); //v danger
        } catch (IOException e){
            System.out.println("Something went wrong...");
        }
        System.out.println(fileContents);
        String[] data = fileContents.split("\n");
        int numLines = data.length;
        System.out.println(numLines + " lines");

        //how do I count the number of words??
        int wordCount = 0;
        for (String line : data){
            String[] words = line.split(" ");
            wordCount += words.length;
        }
        System.out.println(wordCount + " words");
    }
}
