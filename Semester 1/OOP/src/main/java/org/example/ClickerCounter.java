package org.example;

public class ClickerCounter {
    private int count, dispSize;

    //9999 -> if dispSize was 4
    //but In general-> how big can ints get? 2 billionish
        //2,000,000,000
    //what should be the maximum dispSize?
        //9 digits -> means a max count of 999999999

    public ClickerCounter(int dispSize){
        this.dispSize = dispSize;
        if (dispSize > 9){
            this.dispSize = 9;
        }
        count = 0;
    }

    public ClickerCounter(){
        dispSize = 4;
        count = 0;
    }

    //Can you write a constructor with BOTH property parameters
    public ClickerCounter(int count, int disp){
        this.count = count;
        dispSize = disp;
        if (disp > 9){
            dispSize = 9;
        }
    }

    public int getCount(){
        return count;
    }

    public int getDispSize(){
        return dispSize;
    }

    public void click(){
        count++;
        //we have a disp size. and so, we must wraparound
        //if disp = 3, I could go 0 -> 999, but then 1000, we wraparound to 0.
        if ((count+"").length() > dispSize){
            count = 0;
        }

        //also a mathematical solution
            //uses clever math with powers of 10
        //if (count >= Math.pow(10, dispSize)) {count = 0;}
    }

    //GOAL: Format the number with the right amount of digits
    public String display(){
        //String formattedStr = String.format("%0Xd", number);
        /*
            int number = 33;
            S.o.p(String.format(%08d, number));
            -> 00000033
         */
        String formattedCount = String.format("%0" + dispSize + "d", count);
        return formattedCount;
    }
}
