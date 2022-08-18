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

        double subTotal = 40.25;
        //should we represent 20% as 20 or 0.20?
        double taxPercentage = 0.075;
        double tipPercentage = .20;

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