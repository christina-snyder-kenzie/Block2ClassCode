import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        double monTemp = 73;
        double tuesTemp = 67;
        double wedTemp = 70;
        double thursTemp = 81;
        double friTemp = 78;

        /*
        general syntax for a variable:
            datatype name = value;

        general syntax for an array:
            datatype[] arrName = option1 or option2
                option1: {val1, val2, val3, ..., valx};
                option2: new datatype[size];
                     size => the number of things I want to hold
                     this fills up with default values:
                        String -> null
                        int -> 0
                        double -> 0.0
                        boolean -> false
                option3: new datatype[]{val1, val2, val3};
         */
        double[] temps = {monTemp, tuesTemp, 70, 81, 78};

        System.out.println(temps);
        System.out.println(Arrays.toString(temps));

        System.out.println("Tuesday's temp: " + temps[1]); //accessing
        System.out.println("Friday's temp: " + temps[4]); //getting or indexing

        System.out.println("The number of temps is: " + temps.length);

        int lastIndex = temps.length - 1;

        temps[4] = 102; //update
        System.out.println(Arrays.toString(temps));

        String[] guestList = new String[6];
        guestList[0] = "me";
        guestList[1] = "Charles";
        guestList[2] = "Michael";
        guestList[3] = "Beyonce";
        guestList[4] = "Bob Ross";
        guestList[5] = "Oprah";
        System.out.println(Arrays.toString(guestList));

        String lastElement = guestList[guestList.length - 1];
        String bestGuest = guestList[0];
        String mysteryGuest = guestList[guestList.length / 2];
        System.out.println(mysteryGuest);
        String tricky = guestList[guestList.length - 2];
        System.out.println(tricky);

        //swap the values at positions 2 and 5
        // this is the WRONG answer
            //guestList[2] = guestList[5];
            //guestList[5] = guestList[2];

        //BELOW is the right answer!
        String savedGuest = guestList[2];
        guestList[2] = guestList[5];
        guestList[5] = savedGuest;
        //A SWAP MUST have at least 3 lines


    }
}
