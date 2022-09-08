public class ForLoopExamples {
    public static void main(String[] args) {
        /*
            inititialize our looping variable (index or number)
            while (condition){
                do stuff
                udpate to the loop variable
            }

            for (initialization ; condition ; update){
                do stuff like normal
            }
         */

        //PRINT out an array using a for loop
        int[] arr = {7, 5, 1, 3, 8, 2};

        //variables only exists within the brackets where they are defined
        //variable scope
        for (int index = 0 ; index < arr.length ; index++){
            System.out.print(arr[index] + " ");
        }
        //System.out.println("Index is: " + index); //ERROR

        //calculate the AVERAGE value of my array
        //1
        int basket = 0;
        for (int index = 0; index < arr.length; index++) {
            //2
            //NOT HERE
            int currValue = arr[index];
            //3
            basket += currValue; //basket = basket + currValue;
            //5

        } //end of the for loop
        //4
        double average = (double) basket / arr.length;
        System.out.println("\nThe average is: " + average);

        int[] doubles = {8, 2, 2, 5, 5, 7, 3, 3, 19, 19};
        //count ADJACENT DUPLICATES
        //init counter
        int counter = 0;
        //loop
        for (int index = 0; index < doubles.length - 1; index++) {
            int me = doubles[index];
            int neighbor = doubles[index + 1];
            //if statement
            if (me == neighbor) {
                counter++;
            }
        }
        //present results
        System.out.println("You have " + counter + " adj dups");





    }
}
