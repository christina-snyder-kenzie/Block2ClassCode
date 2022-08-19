import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //we need to know:
            //how much we want to tip -> 20%
            //subtotal
            //tax percentage

        //what do we need to do?
            //calculate our total
            //calculate the tip amount
            //update the total

        //what are our outputs?
            //we need to know the tip amount
            //we need the final total

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your subtotal: $");
        String amount = scan.nextLine();
        //Double.parseDouble()
        //"40.25" -> 40.25
        double subTotal = Double.parseDouble(amount);
        //should we represent 20% as 20 or 0.20?
        System.out.print("Enter the tax as a decimal: ");
        String tax = scan.nextLine();
        double taxPercentage = Double.parseDouble(tax);
        System.out.print("Enter the tip percentage as a decimal: ");
        String tip = scan.nextLine();
        double tipPercentage = Double.parseDouble(tip);

        double total = (subTotal * taxPercentage) + subTotal;
        //a different way=> subTotal * (1 + taxPercentage);
        //PEMDAS (please excuse my dear aunt sally)
        //order of operations
        //parentheses, exponents, multiplication/division, addition/subtraction
        //
        double tipAmount = total * tipPercentage;
        total = total + tipAmount;

        System.out.println(tipAmount);
        System.out.println(total);

    }
}