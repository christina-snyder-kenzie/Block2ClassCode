public class FunWithMath {
    public static void main(String[] args) {
        //+ - * / ()

        //2^4 => 16 (2*2*2*2)
        //^ = bitwise XOR (...not exponents..)

        //ENTER: Math methods
        /*
            utility helpers
                they perform a specific task

            double result = Math.pow(base, exponent);
            double root = Math.sqrt(number);
            Math.abs(value) -> absolute value (results in the positive version)
            Math.round(value) -> follows normal rounding rules (0-0.49 down) (.5+ up)
                rounds to the nearest whole number
            Math.sin(value), Math.cos(value)
         */
        double fourth = Math.pow(2, 4);
        System.out.println(fourth);

        double num = Math.sqrt(fourth);
        System.out.println(num);

        double test = 7; //promotion
        System.out.println(test);

        //int tricky = 7.5; DOESN'T WORK -> Possibly Lossy Conversion Error

        //casting comes in
            //casting is a way to FORCE a change in type
        int example = (int) 7.5; //forces truncation
        System.out.println(example);

        int a = 7 / 2;
       // int b = 7.0 / 2;
        double c = 7.0 / 2;
        double d = 7 / 2; //7/2 -> 3 it's promoted to 3.0
        int e = (int) (7.0 / 2);
        double f = (double) 7 / 2;
        double g = (double) (7 / 2);


        System.out.println("A: " + a);
      //  System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("E: " + e);
        System.out.println("F: " + f);
        System.out.println("G: " + g);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Math.PI);

        System.out.println(Math.pow(Math.PI, 2));

    }
}
