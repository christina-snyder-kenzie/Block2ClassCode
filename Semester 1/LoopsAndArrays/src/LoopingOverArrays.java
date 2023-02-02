public class LoopingOverArrays {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 1, 3, 8, 2, 9, 6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

        int count = 0;
        while (count < numbers.length){
            System.out.println(count + ": " + numbers[count]);
            count++;
        }

        /*
            track an index
            while (index < arr.length){
                //do something with arr[index]
                index++;
            }
         */
        //I only want to print out numbers less than or equal to 5
        System.out.println("---less than 5 below---");
        int index = 0;
        while (index < numbers.length){
            if (numbers[index] <= 5){
                System.out.print(numbers[index] + " ");
            }
            index++;
        }

        //Now I want to only print out the odd elements
        System.out.println("----Only ODDS below----");
        int i = 0;
        while (i < numbers.length){
            if (numbers[i] % 2 == 1){
                System.out.println(numbers[i]);
            }
            i++;
        }

        //I want to print numbers out backwards
        //starting point -> the LAST index
        //while loop -> we need to stop at the FRONT (index 0?)
            //print current value
            //update -> is it addition or subtraction?
        System.out.println("-------");
        int backwards = numbers.length - 1;
        while (backwards >= 0){
            System.out.println(numbers[backwards]);
            backwards--;
        }

        //aggregation
        //collecting things
        //accumulation
        //calculating a sum of an array
        int basket = 0;
        int aisleNumber = 0;
        while (aisleNumber < numbers.length){
            int currItem = numbers[aisleNumber];
            basket = basket + currItem; //basket += currItem;
            aisleNumber++;
        }
        System.out.println("The sum is: " + basket);
    }

}


