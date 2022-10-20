package org.example;

import java.util.Arrays;

public class BuildingStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, I love pizza and popcorn");
        char lastLetter = sb.charAt(sb.length() - 1);

        //GOAL: replace pizza with caramel
        //.replace(start, stop, newString);
        int indexOfPizza = sb.indexOf("pizza");
        int stoppingPoint = indexOfPizza + 5;
        System.out.println(sb);
        sb.replace(indexOfPizza, stoppingPoint, "caramel");
        System.out.println(sb);

        //GOAL: squeeze in chocolate between 'I love' and 'caramel'
        //.insert(index, newTHING);
        sb.insert(sb.indexOf("caramel"), "chocolate and ");
        System.out.println(sb);

        //.delete(start, stop)
        //GOAL: remove the 'I love '
        sb.delete(0, "I love ".length());
        System.out.println(sb);

        String[] favs = sb.toString().split(" and ");
        System.out.println(Arrays.toString(favs));

        //String.join(delimiter, array) -> a delimited string
        String excited = String.join("!", favs) + "!";
        System.out.println(excited);

        System.out.println(fancyFormat(favs));

    }//ends my main method

    /*
    {Candy, Caramel, Popcorn} -> Candy! Caramel! and Popcorn
    {Candy, Caramel, Popcorn, PixieSticks} -> Candy! Caramel! Popcorn! and PixieSticks
    {Caramel, Popcorn} -> Caramel! and Popcorn
    {Popcorn} -> Popcorn
    {} -> ""
    null -> ""
     */
    public static String fancyFormat(String[] data){
        if (data == null){
            return "";
        } else if (data.length == 0){
            return "";
        } else if (data.length == 1){
            return data[0];
        } else {
            //what do I KNOW about length? if I'm here?
            //GUARANTEE: length > 1! (2 or more)

            //Option 1: if statement in your regular loop
                //if I'm less than length - 1
                    //do the regular thing (! )
                //if I AM length - 1
                    //do the special thing (and)
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < data.length; i++){
                if (i < data.length - 1){
                    builder.append(data[i]);
                    builder.append("! ");
                } else {
                    builder.append("and ");
                    builder.append(data[i]); //i -> length - 1
                }
            }
            return builder.toString();
            //Option 2: to end your loop early
                //in your loop
                    //do the regular thing
                //outside your loop
                    //handle the last guy
            /*
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < data.length - 1; i++){
                builder.append(data[i]);
                builder.append("! ");
            }
            builder.append("and ");
            builder.append(data[data.length - 1]);
            return builder.toString();
             */
        }
    }


}//ends the class
