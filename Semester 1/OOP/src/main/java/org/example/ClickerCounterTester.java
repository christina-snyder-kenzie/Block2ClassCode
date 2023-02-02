package org.example;

public class ClickerCounterTester {
    public static void main(String[] args) {
        ClickerCounter c0 = new ClickerCounter();
        ClickerCounter c1 = new ClickerCounter(7);
        ClickerCounter c2 = new ClickerCounter(20);
        ClickerCounter c3 = new ClickerCounter(500, 7);
        ClickerCounter c4 = new ClickerCounter(500, 20);

        ClickerCounter[] clickers = {c0, c1, c2, c3, c4};
        for (int i = 0; i < 5; i++){
            System.out.println("c" + i + "'s count: " + clickers[i].getCount());
            System.out.println("c" + i + "'s dispS: " + clickers[i].getDispSize());
        }

        ClickerCounter tester = new ClickerCounter(9);
        for (int i = 0; i < 3000; i++){
            tester.click();
            System.out.println(tester.display());
        }
    }
}
