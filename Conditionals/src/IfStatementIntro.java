public class IfStatementIntro {
    public static void main(String[] args) {

        //boolean can only be true or false
        /*
            if (condition is true) {
                //we do something special
            } else if(second condition) {
                //this we do if the second condition is true
            } else {
                //we do something different
            }

         */
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("The number is negative");
        }

        double grade = 82;
        if (grade >= 90){
            System.out.println("A");
        } else if (grade >= 80){
            System.out.println("B");
        } else if (grade >= 73){
            System.out.println("C");
        } else if (grade >= 70){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //we can COMBINE two boolean expressions
        //AND vs OR
        //&& vs ||
        // booleanExpress1 && booleanExpress2
            //will combine both into a single boolean
            //a single true or false
            //the rule is if BOTH sides are true,
                //the whole thing is true
        // booleanExpress1 || booleanExpress2
            //will still combine into a single boolean
            //but now only ONE Side needs to be true

        System.out.println("------Sequential Ifs-------");
       grade = 97;
        if (grade >= 90){
            System.out.println("A");
        }
        if (grade >= 80 && grade < 90){
            System.out.println("B");
        }
        if (grade >= 73 && grade < 80){
            System.out.println("C");
        }
        if (grade >= 70 && grade < 73){
            System.out.println("D");
        }
        if (grade < 70){
            System.out.println("F");
        }


        int windSpeed = 132;
        if (windSpeed >= 157){
            System.out.println("Cat 5- Catastrophic! Watch out!");
        }
        if (windSpeed >= 130 && windSpeed <= 156){
            System.out.println("Cat 4- Looks pretty bad.");
        }
        if (windSpeed >= 111 && windSpeed <= 129){
            System.out.println("Cat 3- Super devastating");
        }
        if (windSpeed >= 96 && windSpeed <= 110){
            System.out.println("Cat 2- There will be some damage");
        }
        if (windSpeed >= 74 && windSpeed <= 95){
            System.out.println("Cat 1- Barely a hurricane.");
        }
        if (windSpeed < 74){
            System.out.println("Not strong enough!");
        }


        boolean itsColdOutside = true;
        String precipitation = "snowy";
        boolean thereIsSunshine = false;

        if (itsColdOutside || precipitation.equals("rainy")){
            System.out.println("I need a jacket");
        } else if (itsColdOutside && precipitation.equals("snowy") && !thereIsSunshine) {
            //its cold, its snowing, and there is no sunshine
            //STAY INSIDE
            System.out.println("Stay inside");
        }

        if (thereIsSunshine){
            System.out.println("You need sunglasses");
        }

    } //ends the main method

    //we're gonna play in here today

} //ends the file/class

//This is the DEATH area