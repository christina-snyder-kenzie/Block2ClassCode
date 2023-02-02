public class StringIntro {
    public static void main(String[] args) {
        String place = "Colombia";
        int numLetters = place.length();
        System.out.println(place + " has " + numLetters + " letters");
        String school = "Kenzie Academy";
        int schoolLetters = school.length();

        //INVOKED a method UPON an object
            //Invoke -> call or execute
            //object -> anything that's not a primitive type
            //method -> special abilities, functions, methods perform an action

        //instance method vs static method
            //instance methods
            //instance -> a particular existance

        //.equals() compares the contents of strings
        boolean test = place.equals(school);

        //implicit vs explicit parameters
            //implicit parameter comes BEFORE the dot
                //at most 1
            //explicit parameters go INSIDE the parentheses
                //0 to many

        //in general, methods are called like this:
            //implicitVar.methodName(explicitVars);

        //[] and strings DON'T MIX

        //.charAt(index) -> returns a single character at the specified index
        char firstLetter = place.charAt(0);
        System.out.println(place + " begins with " + firstLetter);
        char lastLetter = place.charAt(place.length() - 1);
        System.out.println(place + " ends with " + lastLetter);

        //.substring(*) -> returns a portion of your string
        //substring is OVERLOADED (same method name, different explicit parameters)
            //String portion = str.substring(startingPos);
                //starts at startingPos and goes to the end of your String
                //to get the last X letters -> .substring(length - X);
            //String portion = str.substring(start, stop);
                //include the starting index, and exclude the stopping one
                    //we go up to but not including that stopping point
        String allButFirst = place.substring(1);
        System.out.println(allButFirst);
        String testTwo = place.substring(place.length() - 3);
        System.out.println(testTwo);
        String lastX = place.substring(place.length() - 5);
        System.out.println(lastX);

        String firstTwo = place.substring(0, 2);
        System.out.println(firstTwo);
        String wholeThing = place.substring(0, place.length());
            //-> Colombia
        String tricky = place.substring(2, 6);
            //-> lomb


        //.indexOf(babyString) -> takes a smaller string and returns the index where it lives
            //int position = bigStr.indexOf(littlerString);
                //returns -1 if the littlerString does not exist within the big guy
        int posOfM = place.indexOf("m");
        System.out.println("m lives at position: " + posOfM);
        int posCapM = place.indexOf("M");
        System.out.println("M lives at position: " + posCapM); // -1
        int posOfLomb = place.indexOf("lomb");  // 2
        int posOfBia = place.indexOf("bia");  //5
        int posOfO = place.indexOf("o"); //1 -> pos of the first guy

        //boolean itExists = something.indexOf(smtgElse) >= 0;

        //replace(oldStr, newStr) -> replaces all instances of the oldStr with the new one
            //String updated = str.replace(oldStuff, newStuff);
        String attedUp = place.replace("a", "@");
        System.out.println(attedUp);
        String zeroed = place.replace("o", "0");
        System.out.println(zeroed);
        //place = place.replace("", ""); //overwrite
        String noMs = place.replace("m", "");
        System.out.println(noMs);

        place = place.replace("", "");

        //Strings are IMMUTABLE
            //-> they can never change
            //they can be overwritten, but they do not change

        //.toCharArray() -> returns an array where each character has it's own spot
            //char[] data = str.toCharArray();
        char[] letters = place.toCharArray();
        for (char let : letters){
            System.out.print(let + " | ");
        }
        System.out.println();

        String sentence = "The puppy palace ate cupcakes";
        //.split(delimiter) -> cuts up your string around the delimiter
            //delimiter -> a fancy way of saying separator
                //1,2,3,4 -> delimiter = ','
        String[] words = sentence.split(" ");
        for (String word : words){
            System.out.println(word);
        }

        String[] pieces = sentence.split("a");
        for (String piece: pieces){
            System.out.println(piece);
        }




    }
}
