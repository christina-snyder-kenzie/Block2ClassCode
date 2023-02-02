/*
    Plan:
    1. split sentence into wordArray
    2. set longestWord = wordArray[0]
    3. For loop
    3a.     if currentWord.length > longestWord.length {
    3b.         longestWord = currentWord;
            }
    4. sout longestWord
    How to handle nulls?
    1. Use if to skip over code
    2. Check for null, convert to a empty string
    null <--  "" <-- empty string
    length()
 */

import java.util.Scanner;

public class LongestWord {
    //methods
    public static String findLongestWord(String sentence){
        String longestWord = "";
        String[] wordArray;

        //convert null to empty string
        if(sentence == null){
            sentence = "";
        }

        //longest word algorithm
        wordArray = sentence.split(" ");
        longestWord = wordArray[0];
        for (int i = 0; i < wordArray.length ; i++) {
            String currentWord = wordArray[i];
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputStr;
        String inputStr = "This is my test string.";

        System.out.println("Enter a string");
        userInputStr = scanner.nextLine();

        //call findLongestWord method
        System.out.println(findLongestWord("O brave new world creatures in it"));
        System.out.println(findLongestWord("Java"));
        System.out.println(findLongestWord(""));
        System.out.println(findLongestWord(null));
        System.out.println(findLongestWord(inputStr));

        //clean out punctuation
        userInputStr = userInputStr.replaceAll("!", "");

        System.out.println(findLongestWord(userInputStr));

    }

    public static void main_backup(String[] args) {
        //declare variables
        //String sentence = "O brave new world that hath such creatures in it";
        //String sentence = "Java";
        //String sentence = "Java 16.105";
        //String sentence = "";
        String sentence = null;

        int wordLength;
        int wordIndex;
        String[] wordArray;
        String longestWord;

        //convert null to empty string
        if(sentence == null){
            sentence = "";
        }

        //longest word algorithm
        wordArray = sentence.split(" ");
        longestWord = wordArray[0];
        for (int i = 0; i < wordArray.length ; i++) {
            String currentWord = wordArray[i];
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }
        System.out.println(longestWord);
    }

}