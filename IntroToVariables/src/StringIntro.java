public class StringIntro {
    public static void main(String[] args) {
        //Strings are a special type of data
            //it's an object
            //strings have special abilities
        String word = "coffee";
        System.out.println(word);
        System.out.println("word");

        //length => the number of letters in a string
        int numLetters = word.length();
        String favFood = "empanada";
        int len = favFood.length();

        System.out.println(word + " has " + numLetters + " letters");
        System.out.println(favFood + " has " + len + " letters");
        //forward slash//
        System.out.println("\"" + word + "\"" + " has " + numLetters + " letters");
        System.out.println("\t\t\t\tHello\n world!");

        System.out.println(3 == 3);
        System.out.println(3 == 4);
        System.out.println(3.14 == 3.14);

        String test = new String("hello");
        String other = new String("hello");
        System.out.println("test: " + test);
        System.out.println("other: " + other);
        System.out.println(test == other);
        System.out.println("hello" == "hello");

        //the .equals() method
            //actually compares the TEXT of the string
        System.out.println(test.equals(other));
        System.out.println(test.equals("HELLO"));
        System.out.println(test.equalsIgnoreCase("HELLO"));

        String snack = "AvOcAdO";
        String allLower = snack.toLowerCase();
        String ALL_UPPER = snack.toUpperCase();
        System.out.println(snack);
        System.out.println(allLower);
        System.out.println(ALL_UPPER);
    }
}
