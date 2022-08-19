import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(name + ", What is your favorite color?");
        String favColor = scan.nextLine();
        System.out.println(favColor + "???? That's mine too!");

        System.out.print("Enter the number of brothers you have: ");
        String brothers = scan.nextLine();

        System.out.print("Enter the number of sisters you have: ");
        String sisters = scan.nextLine();

        //"2" + "2" => 22
        //vs
        //2 + 2 => 4
        //USE: Integer.parseInt()
        System.out.println(brothers + sisters);

        int numBrothers = Integer.parseInt(brothers);
        int numSisters = Integer.parseInt(sisters);

        System.out.println(numBrothers + numSisters + " siblings!");


    }
}
