package org.example;

import java.util.*;
import java.io.*;

public class CommanderProcessor {
    public static void main(String[] args) {
        //GOAL: get an arrayList with each line
        ArrayList<String> lines = readLines();
        System.out.println(lines.size());

        //GOAL: Given a deckName, how many cards are in that deck?
            //1. Find the column
        HashMap<String, Integer> deckIndexMap = buildIndexMap(lines);
        System.out.println(deckIndexMap);
        String deckName = "Bant Enchant";
        int columnIndex = deckIndexMap.get(deckName);
        System.out.println(deckName + " lives at " + columnIndex);
            //2. Count non-empty spaces (which is now, the true spaces)
        boolean[][] dataMap = makeDataMap(lines);
        int counter = 0;
        for (int i = 0 ; i < dataMap.length; i++){
            if (dataMap[i][columnIndex]){
                counter++;
            }
        }
        System.out.println(deckName + " has " + counter + " cards");

        //which deck has the most cards?
        //given a card name, which decks is in?
        //What is the most frequent card used?
        //Given a deck name, what cards are in that deck?
    }

    //GOAL: write a method that will turn lines into an array of data!
    //torn between: String, int, boolean
    public static boolean[][] makeDataMap(ArrayList<String> lines){
        boolean[][] data = new boolean[lines.size() - 1][ lines.get(0).split("\t").length - 1 ];
        for (int i = 1; i < lines.size(); i++){
            String[] currLineData = lines.get(i).split("\t");
            for (int j = 1; j < currLineData.length; j++){
                if (currLineData[j].length() != 0) {
                    data[i-1][j-1] = true;
                }
            }
        }
        return data;
    }

    //GOAL: build a deck index map, given an arraylist of lines
    public static HashMap<String, Integer> buildIndexMap(ArrayList<String> lines){
        String headerRow = lines.get(0);
        HashMap<String, Integer> map = new HashMap<>();
        String[] headerData = headerRow.split("\t");
        for (int i = 1; i < headerData.length; i++){
            map.put(headerData[i], i - 1); //i - 1 bc the deck at column 1 should go to index zero
        }
        return map;
    }

    public static ArrayList<String> readLines(){
        ArrayList<String> lines = new ArrayList<String>();
        //filename
        //fileinputstream
        //inputstreamreader
        //bufferedreader
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("commander.tsv")));
        } catch (FileNotFoundException e){
            System.out.println("FIle not found");
        }
        try {
            String line = "";
            while ( (line = reader.readLine()) != null){
                lines.add(line);
            }

            reader.close();
        } catch (IOException e){
            System.out.println("Problems with file closing");
        }
        return lines;
    }
}
