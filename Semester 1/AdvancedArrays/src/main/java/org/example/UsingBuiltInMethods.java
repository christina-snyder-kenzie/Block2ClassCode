package org.example;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class UsingBuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 3};
        int[] bigger = ArrayUtils.add(arr, 8);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bigger));

        int[] doubledouble = ArrayUtils.addAll(bigger, bigger);
        System.out.println(Arrays.toString(doubledouble));

        int[] removed = ArrayUtils.remove(doubledouble, 1);
        System.out.println(Arrays.toString(removed));

        int[] no8s = ArrayUtils.removeElement(doubledouble, 8);
        System.out.println(Arrays.toString(no8s));

        no8s = removeAll8s(doubledouble);
        System.out.println(Arrays.toString(no8s));
    }

    public static int[] removeAll8s(int[] arr){
        while (ArrayUtils.contains(arr, 8)){
            arr = ArrayUtils.removeElement(arr, 8);
        }
        return arr;
    }

    //GOAL: Take an array, and remove the specified index
    //{7, 5, 1, 3, 8, 9} -> {7, 5, 3, 8, 9}
        //toReturn[2] = arr[3];
        //toReturn[3] = arr[4];
        //toReturn[4] = arr[5];

    //if i starts at 2: for (int i = index; i < toReturn.length; i++)
    // i => 2, 3, 4, 5, but then the loop ends
        //toReturn[i] = arr[i + 1];

    //if i starts at 3: for (int i = index + 1; i < arr.length; i++)
    //i => 3, 4, 5, 6 but then the loop ends
        //toReturn[i-1] = arr[i];

    public static int[] MYremove(int[] arr, int index){
        int[] toReturn = new int[arr.length - 1];
        for (int i = 0; i < index; i++){
            toReturn[i] = arr[i];
        }
        for (int i = index; i < toReturn.length; i++){
            toReturn[i] = arr[i + 1];
        }
        return toReturn;
    }


}
