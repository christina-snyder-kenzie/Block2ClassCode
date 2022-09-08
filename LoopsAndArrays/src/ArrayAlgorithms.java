import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        //(int) (Math.random() * 100) + 1;
            //a random # between 1 and 100
        //FILLING an array
        int[] arr = new int[10];
        int index = 0;
        while (index < arr.length) {
            arr[index] = (int) ((Math.random() * 100) + 1);
            index++;
        }
        System.out.println(Arrays.toString(arr));

        //COUNTING how many values greater than 50
        int i = 0;
        int counter = 0;
        while (i < arr.length){
            int currValue = arr[i];
            if (currValue > 50){
                counter++;
            }
            i++;
        }
        System.out.println("There are " + counter + " numbers greater than 50");

        //SUM the elements of my array (Only greater than 50)
            //add together
        int indexSum = 0;
        int total = 0;
        while (indexSum < arr.length){
            int currValue = arr[indexSum];
            if (currValue > 50) {
                total += currValue; //total = total + currValue;
            }
            indexSum++;
        }
        System.out.println("The sum of values greater than 50 is: " + total);

        //find the MAXIMUM VALUE of my array
        int maximum = arr[0]; //page 0
        int page = 1; //this is my index
        while (page < arr.length){
            int currNumber = arr[page];
            if (currNumber > maximum){
                maximum = currNumber;
            }
            page++;
        }
        System.out.println("The biggest number is: " + maximum);

        //we want to find the POSITION of the MINIMUM
        int minimum = arr[0];
        int minIndex = 0;
        int currPage = 1;
        while (currPage < arr.length){
            int currValue = arr[currPage];
            if (currValue < minimum){
                minimum = currValue;
                minIndex = currPage;
            }
            currPage++;
        }
        System.out.println("The smallest value lives at index " + minIndex);

    }
}
