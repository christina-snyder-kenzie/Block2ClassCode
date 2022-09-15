public class YarnExamples {
    public static void main(String[] args) {
        //take two strings and sandwich them
            // firstHalfFirstString thesecondString thesecondHalfofthefirstString
        //first = book
        //second = shelf
        // bo + shelf + ok
        String bread = "book";
        String meat = "shelf";

        String slice1 = bread.substring(0, bread.length() / 2);
        String slice2 = bread.substring(bread.length() / 2 /*, bread.length()*/);
        String sandwich = slice1 + meat + slice2;
        System.out.println(sandwich);

        String place = "Colombia";
        //COUNT the number of o's

        /*
            init counter
            loop
                if statement -> if it's an 'o'
                    update counter
         */
        //str.charAt(i) == 'o'
        //str.substring(i, i + 1).equals("o")
        //first convert to a charArray, letters[i] == 'o'
        int counter = 0;
        for (int i = 0; i < place.length(); i++){
            if (place.charAt(i) == 'o'){
                counter++;
            }
        }
        counter = 0;
        for (int i = 0; i < place.length(); i++){
            if (place.substring(i, i + 1).equals("o")){
                counter++;
            }
        }
        counter = 0;
        for (char letter : place.toCharArray()){
            if (letter == 'o'){
                counter++;
            }
        }

        String sentence = "The puppy palace ate cupcakes and pizza";
        //my task is to find the number of words that start with p
        String[] words = sentence.split(" ");
        int countP = 0;
        for (String currWord : words){
            int indexOfP = currWord.indexOf("p");
            if (indexOfP == 0){
                countP++;
            }
            /*
            String firstLetter = currWord.substring(0, 1);
            if (firstLetter.equals("p")){
                countP++;
            }
            OR
            char firstLetter = currWord.charAt(0);
            if (firstLetter == 'p'){
                countP++;
            }
             */
        }
        System.out.println("There are " + countP + " words that start with 'p'");

        String toTest = (" " + sentence).replace(" p", " ");
        int result = (" " + sentence).length() - toTest.length();
        System.out.println("result: " + result);




    }
}
