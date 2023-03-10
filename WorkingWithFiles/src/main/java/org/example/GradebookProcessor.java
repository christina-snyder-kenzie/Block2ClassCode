package org.example;

import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class GradebookProcessor {
    public static void main(String[] args) {
        //GOAL: Print the file
        //String fileContents = getContentsEasy("gradebook.csv");
        //System.out.println(fileContents);
        ArrayList<String> lines = new ArrayList<String>();
        try {
            String fileName = "gradebook.csv";
            FileInputStream stream = new FileInputStream(fileName);
            InputStreamReader streamReader = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(streamReader);

            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                lines.add(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException f){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Trouble with file");
        }

        //GOAL: to populate the grades array
        int numRows = lines.size();
        int numCols = lines.get(0).split(",").length;
        double[][] grades = new double[numRows][numCols];
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){
            String currLine = lines.get(i);
            String[] lineData = currLine.split(",");
            names.add(lineData[0]);
            for (int j = 1; j < lineData.length; j++){
                double grade = Double.parseDouble(lineData[j]);
                grades[i-1][j-1] = grade;
            }
        }
        //GOAL: print out grades
        printOut(grades);

        //process it:
            //calculate our student averages
        for (int i = 0; i < grades.length -1 ; i++){
            double rowSum = 0; //this will reset for each row
            for (int j = 0; j < grades[0].length - 1; j ++){
                rowSum += grades[i][j];
            }
            //calc the average
            int numGrades = grades[0].length - 1;
            double average = rowSum / numGrades;
            //put it in the right spot
            grades[i][grades[0].length - 1] = average;
        }
        printOut(grades);
            //calcualte our assign averages
            //calcuate our overall average
        for (int j = 0 ; j < grades[0].length; j++){
            double colSum = 0;
            for (int i = 0; i < grades.length - 1; i++){
                colSum += grades[i][j];
            }
            //calc the avg
            int numGrades = grades.length - 1;
            double avg = colSum / numGrades;
            //put it in the right spot
            grades[grades.length - 1][j] = avg;
        }
        printOut(grades);
            //write it to a new file

        String newFileName = "UpdatedGradebook.csv";
        try {
            FileWriter fileWriter = new FileWriter(newFileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String header = lines.get(0);
            writer.write(header + ",Average");
            names.add("Average");
            for (int i = 0; i < names.size(); i++){
                writer.write("\n" + names.get(i));
                for (int j = 0; j < grades[0].length; j++){
                    writer.write("," + grades[i][j]);
                }
            }
            writer.close();
        } catch (IOException e){
            System.out.println("Something went wrong writing");
        }
    }

    public static void printOut(double[][] arr){
        for (double[] row : arr){
            for (double value : row){
                System.out.print(value + "\t|\t");
            }
            System.out.println();
        }
    }

    //GOAL: take in a file name, and return the file contents
    //I want this method to just work or handle the errors...
    public static String getContentsEasy(String fileName){
        //Path.of()
        Path filePath = Path.of(fileName);
        String fileContents = "";
        try {
            //Files.readString()
            fileContents = Files.readString(filePath);
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
        return fileContents;
    }
}
