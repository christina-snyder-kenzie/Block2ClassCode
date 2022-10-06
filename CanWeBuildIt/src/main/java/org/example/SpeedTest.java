package org.example;

import java.util.ArrayList;

public class SpeedTest {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        //perform a task
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - currentTime;
        System.out.println(elapsedTime);

        int size = 100000;

        long beginArray = System.currentTimeMillis();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = i;
        }
        long endArray = System.currentTimeMillis();

        System.out.println("Arrays: " + (endArray - beginArray));

        long beginList = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++){
            list.add(i);
        }
        long endList = System.currentTimeMillis();

        System.out.println("ArrayList: " + (endList - beginList));


        long beginList2 = System.currentTimeMillis();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++){
            list2.add(0, i);
        }
        long endList2 = System.currentTimeMillis();

        System.out.println("ArrayList: " + (endList2 - beginList2));

        long beginString = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < size; i++){
            str = str + "a";
        }
        long endString = System.currentTimeMillis();

        System.out.println("String: " + (endString - beginString));

        long beginBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < size; i++){
            sb.append("a");
        }
        long endBuilder = System.currentTimeMillis();

        System.out.println("Builder: " + (endBuilder - beginBuilder));





    }
}
