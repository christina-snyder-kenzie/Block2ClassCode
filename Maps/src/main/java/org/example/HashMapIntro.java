package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String, Integer> medals = new HashMap<>();
        medals.put("Norway", 16);
        medals.put("Germany", 12);
        medals.put("China", 9);
        medals.put("USA", 8);
        medals.put("Sweden", 8);
        System.out.println(medals);

        String x = "hello";
        System.out.println(x.hashCode());
        String y = new String("hello");
        System.out.println(y.hashCode());
        /*
        put(K key, V Value){
            int index = key.hashCode() % table.length;
            table[index] = key, value;
        }

        get(K key){
            int index = key.hashCode() % table.length;
            return table[index].value
        }
        */

        int norwayGolds = medals.get("Norway");
        System.out.println(norwayGolds);

        for (String country : medals.keySet()){
            System.out.println(country + " - " + medals.get(country));
        }

        System.out.println("---------");
        for (HashMap.Entry<String, Integer> entry : medals.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("---------");
        for (int golds : medals.values()){
            System.out.println(golds);
        }

        System.out.println(medals.get("Canada"));
        //int canadaGolds = medals.get("Canada");
        //A null pointer exception happens when I call a method upon an object which is null

        Integer num = 7;
        int primitive = num.intValue();

        //option 1: use if statements to help
        int canadaGolds = -1;
        if (medals.get("Canada") != null){
            canadaGolds = medals.get("Canada");
        }

        //option 2: Use getOrDefault()
        int canadianGoldMedals = medals.getOrDefault("Canada", -1);

    }
}




