package org.example;

public class InterfacePractice {
    public static void main(String[] args) {
      /*  Animal a = new Animal(4, 15.5, true);
        a.eat();
        double measure = a.getMeasure();

        Measurable m = a;
        System.out.println(m.getMeasure());
        //m.eat(); //doesn't work

        Measurable[] thingies = new Measurable[5];
        //I want to put 5 animals into thingies
        //I want their weights to increase by 10 each time
        // 0, 10, 20, 30, 40
        // 0, 1,  2,  3,  4
        //they all have 4 legs, and they all have eyes
        for (int i = 0; i < 5; i++){
            thingies[i] = new Animal(4, i * 10, true);
        }
*/
        //Similar thing for bankaccounts
        //Starting balances of 0, 1000, 2000, 3000, 4000 dollars
        //Can you do this? Call the array-> accounts
        Measurable[] accounts = new Measurable[5];
        for (int i = 0; i < 5; i++){
            accounts[i] = new BankAccount(i * 1000);
        }
       // System.out.println(average(thingies));
        System.out.println(average(accounts));
    }//ends my main method

    //GOAL: write one method that averages a measurable[]
    public static double average(Measurable[] arr){
        //bucket
        double bucket = 0;
        //loop
        for (int i = 0; i < arr.length; i++){
            bucket += arr[i].getMeasure();
        }
            //put stuff in the bucket (the measure?)
        //calc the average (total / length)
        double avg = bucket / arr.length;
        //return it
        return avg;
    }

}//ends my class
