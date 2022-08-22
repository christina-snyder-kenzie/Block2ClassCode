import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double rad = Double.parseDouble(scan.nextLine());

        double circ = 2 * Math.PI * rad;
        System.out.println("The circumference is: " + circ);
        double area = Math.PI * Math.pow(rad, 2);
        System.out.println("The area is: " + area);
        double volume = (4.0/3) * Math.PI * Math.pow(rad, 3);
        System.out.println("The volume is: " + volume);

    }
}
