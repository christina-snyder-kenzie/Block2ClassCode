package org.example;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Scope {
    public static void main(String[] args) {
        //scope = who can see what when
        int x = 7;
        System.out.println(x);

        String result = "";
        if (x > 0){
            result = "Positive";
        }
        System.out.println(result);

        x = 7;
        int y = x;
        y++;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        int[] arr1 = {7, 5, 1, 3};
        int[] arr2 = arr1; //shallow copy
        int[] arr3 = Arrays.copyOf(arr1, arr1.length); //deep copy
        arr2[0] = 100;
        arr3[0] = 250;
        System.out.println("Arr1: " + arr1[0]);
        System.out.println("Arr2: " + arr2[0]);
        System.out.println("Arr3: " + arr3[0]);

        int a = 3;
        int b = 4;
        int[] c= {7, 5, 1, 3};

        int d = funWithScope(a, b, c);
        //question: What are a, b, c, d, g, h, j after the method has run?
        //RIGHT HERE
        //a -> 3
        //b -> 4 (NOT 7)
        //c[0] -> 1004
        //d -> 7
        //g, h, j DO NOT EXIST

        //IN PLACE => A Method that changes the array parameter, without creating a new one

        int[] numbers = {7, -5, 1, -3, -2, -8};
        System.out.println(Arrays.toString(numbers));
        makeAllPositive(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void makeAllPositive(int[] arr){
        //Math.abs()
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }
    }

    public static int funWithScope(int g, int h, int[] j){
        h += g;
        j[0] = 1004;
        return h;
    }
    //variables only exist within the curly brackets where they are defined
    //System.out.println(x);

}
