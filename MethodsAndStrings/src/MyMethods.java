public class MyMethods {
    public static void main(String[] args) {
        String x = "hello";
        x.length(); //instance method

        double result = Math.pow(2, 6); //static method
        int sum = MyMethods.add(3, 4);
        //implicit parameter is the class name
        int sum2 = add(5, 309); //when you're in the class where you created the method
                                    //you don't need an implicit parameter
        String toTest = "I love pumpkin spice lattes and pecan pie";
        int numLs = countLs(toTest);
        System.out.println(numLs);

        int number = countLetter(toTest, "l");
        int other = countLetter(toTest, "p");

        int numPi = countPi(toTest); //should be 2

        int numVowels = countVowels(toTest);
        System.out.println(numVowels);

        int[] numbers = {7, 5, 1, 3};
        System.out.println(numbers);
        printOut(numbers);
        printOutBackwards(numbers);

        String[] zooAnimals = {"tiger", "zebra", "penguin", "giraffe", "flamingo"};
            //tzpgf
        String firstLetters = grabFirstLetters(zooAnimals);
        System.out.println(firstLetters);

        int position = spotTheLongest(zooAnimals);
        System.out.println(position);
        System.out.println(zooAnimals[position]);

        System.out.println(spotTheLongest(zooAnimals));

    } //ends my main method

    //write a method that calculates an exponent (a ^ b)
    //You're not allowed to use Math.pow or '*' or '+'
    //You can use the multiply method
    //2^6 actually mean??
        //2*2*2*2*2*2
    

    //write a method that takes two numbers, and multiplies them together
    //you are not allowed to use the '*' or '+', no MATH METHODs
    //3 x 5 -> 10
        //5 + 5 + 5
        //3 + 3 + 3 + 3 + 3
    //multiplication is just repeated addition
    public static int multiply(int a, int b){
        int totalSoFar = 0;
        for (int run = 0; run < b; run = add(1, run)){
            //if b = 5, this loop runs 5 times
            //in this loop, I need to add a
            totalSoFar = add(a, totalSoFar);
        }
        return totalSoFar;
    }

    public static int add(int a, int b){
        int answer = a + b;
        return answer;
    }

    //I want to find the POSITION of the word that is LONGEST
    public static int spotTheLongest(String[] arr){
        //init max -> should this be int or string???
            //answer: could be either! whatever you choose, changes your if statement
        String longestWord = arr[0];
        //init maxIndex
        int maxIndex = 0;
        //loop
        for (int i = 0; i < arr.length; i++) {
            String currWord = arr[i];
            //if I find something LONGER
            if (currWord.length() > longestWord.length()) {
                //update max
                longestWord = currWord;
                //update maxIndex
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //write a method that grabs the first letter of each string in an array
    public static String grabFirstLetters(String[] arr){
        String basket = "";
        for (String currWord : arr){
            //charAt or substring
            String firstLetter = currWord.substring(0, 1);
            basket += firstLetter; //basket = basket + firstLetter;
        }
        return basket;
    }

    //write a method that takes in an array and prints it out backwards
    //return type => void
    //parameter => int[] arr
    //name => printOutBackwards
    public static void printOutBackwards(int[] arr){ //header or a signature
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    //this method prints out my array
    //a void return type means we don't return anything
    public static void printOut(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    //I want to count the number of vowels (a, e, i, o, u)
    public static int countVowels(String phrase){
        int numAs = countLetter(phrase, "a");
        int numEs = countLetter(phrase, "e");
        int numIs = countLetter(phrase, "i");
        int numOs = countLetter(phrase, "o");
        int numUs = countLetter(phrase, "u");
        return numAs + numEs + numIs + numOs + numUs;
    }

    //I want to count how many 'pi's there are
    public static int countPi(String str){
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++){
            String window = str.substring(i , i + 2);
            if (window.equals("pi")){
                counter = add(counter, 1);
            }
        }
        return counter;
    }

    //take a string and a mysteryLetter and count how many times it appears
    public static int countLetter(String str, String mysteryLetter){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            String currLetter = str.substring(i, i + 1);
            if (currLetter.equals(mysteryLetter)){
                counter++;
            }
        }
        return counter;
    }

    //take in a String and return the number of l's
    public static int countLs(String str){
        //init counter
        int counter = 0;
        //loop
        for (int i = 0; i < str.length(); i++) {
            String currLetter = str.substring(i, i + 1);
            //if statement -> l's
            if (currLetter.equals("l")) {
                //update
                counter++;
            }
        }
        //present results
        return counter;
    }


    //a method is a chunk of code that can be reused
        //tpyically, it has inputs (parameters) and outputs (what we return)

    //general syntax:
    //public static returnType methodName(dt1 param1, dt2 param2, etc){}



}//ends my class
