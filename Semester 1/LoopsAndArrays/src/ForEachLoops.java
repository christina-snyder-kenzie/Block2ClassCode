public class ForEachLoops {
    public static void main(String[] args) {
        int[] data = {7, 5, 1, 3};
        for (int i = 0; i < data.length; i++){
            int currValue = data[i];
            System.out.print(currValue + " | ");
        }
        System.out.println();
        //for each loop
        // : -> "in"
        for (int currValue : data){
            System.out.print(currValue + " | ");
        }

        int luckyNumber = (int) (Math.random() * 8); //random ints between 0 and 7
        //I want to COUNT how many times the lucky number appears
        //init counter
        int counter = 0;
        //loop
        for (int curr : data){
            //if statement
            if (curr == luckyNumber) {
                //update counter
                counter++;
            }
        }
        System.out.println("\n" + luckyNumber + " appears " + counter + " times");

        //for each loops work with arrays/ collections
        //they're good at grabbing data from start to end

        //General FORMAT (for each loop)
            //for (dt loopVariableName : collectionName)


        //i want to calculate an AVERAGE value
            //avg = sum of all elements / number of elements
        double basket = 0;
        for (int number : data){
            basket += number;
        }
        double avg = basket / data.length;
        System.out.println("The average is: " + avg);

        //find the MINIMUM Value
        //init min
        int min = data[0];
        //loop
        for (int currNumber : data){
            //if we find something SMALLER
            if (currNumber < min) {
                //update
                min = currNumber;
            }
        }
        System.out.println("The smallest number is: " + min);

        //When are foreach loops NOT appropriate?
            //if I need an index, I should use a regular loop
            //if I don't have an array or collection, I should use a regular loop
            //if I need to look at more than one position at a time, I should use a regular loop
                //(the adj. dup problem)




    }
}
