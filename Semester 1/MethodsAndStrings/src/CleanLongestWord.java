public class CleanLongestWord {


    public static String findLongestWord(String input){
        //declare variables
        String currWord;
        String longestWord;
        String[] wordArray;
        int wordLength;

        //clean the input
        input = input.replaceAll("\s+"," ").replaceAll("[!?.,]","");
        //input = input.replaceAll("[!?.,]","");

        //find the max algorithm
        wordArray = input.split(" ");

        //set longestWord to first element IF at least 1 in array
        if(wordArray.length >= 1){
            longestWord = wordArray[0];
        }
        else {
            longestWord = "";
        }

        //loop and compare current word to longest word
        for (int i = 0; i < wordArray.length ; i++) {
            currWord = wordArray[i];
            if(currWord.length() > longestWord.length()){
                longestWord = currWord;
            }
        }

        return longestWord;
    }

    //Write a method that returns a count of strings in a sentence that start with an S (upper or lower)
    //hint: Counting Matches algorithm
    //"This is a sentence" => 1
    public static int countTheSWords (String input )  {
        //declare variables
        int countWords = 0;
        String[] wordArray;

        wordArray = input.split(" ");
        //loop through "something"
        for (int i = 0; i < wordArray.length; i++) {
            //figure out the if - the first letter of current word is S or s
            String currWord = wordArray[i];
            if(currWord.startsWith("S") || currWord.startsWith("s") ){
                countWords++;
            }

        }
        return countWords;
    }

    public static  int  countWordsThatStartWith (String input, String firstLetter){
        //declare variables
        int countWords = 0;
        String[] wordArray;

        wordArray = input.split(" ");
        //loop through "something"
        for (int i = 0; i < wordArray.length; i++) {
            //figure out the if - the first letter of current word is S or s
            String currWord = wordArray[i];

            //change to handle firstLetter
            String lower = firstLetter.toLowerCase();
            String upper = firstLetter.toUpperCase();
            if(currWord.startsWith(upper) || currWord.startsWith(lower) ){
                countWords++;
            }

        }
        return countWords;

    }


    public static void main(String[] args) {

        System.out.println(findLongestWord("  String with     wild   spacing  !!!!!!! "));
        System.out.println(findLongestWord("!!!!!!!??"));
        System.out.println(findLongestWord(""));

        //test countTheSWords
        System.out.println(countTheSWords("This is a sentence"));
        System.out.println(countTheSWords(""));
        System.out.println(countTheSWords("Six snakes in this sentence"));

        //test countWordsThatStartWith
        System.out.println("***Test countWordsThatStartWith***");
        System.out.println(countWordsThatStartWith("This is a sentence", "T"));
        System.out.println(countWordsThatStartWith("This is a test sentence", "T"));


    }
}