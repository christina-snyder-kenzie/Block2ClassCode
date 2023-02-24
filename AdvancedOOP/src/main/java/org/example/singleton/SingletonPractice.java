package org.example.singleton;

public class SingletonPractice {
    public static void main(String[] args) {
        //Treasury t = new Treasury(); //NO

        Treasury t = Treasury.getInstance();
        t.printMoney();
        t.printMoney();
        System.out.println(t.getMoney());

        Treasury t2 = Treasury.getInstance();
        t2.printMoney();
        System.out.println(t2.getMoney());

        System.out.println(t == t2);
    }
}
