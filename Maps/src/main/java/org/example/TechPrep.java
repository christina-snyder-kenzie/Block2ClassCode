package org.example;

import java.util.HashMap;

public class TechPrep {
    public static void main(String[] args) {
        System.out.println(anagram("ratt", "arrt"));
        System.out.println(anagram("listen", "Silent"));
        System.out.println(anagram("listen", "silent"));
    }

    public static boolean anagram(String a, String b){
        //precondition
        // something that must be true for them to be anagrams
        if (a.length() != b.length()){
            return false;
        }

        //build a map for the string a
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : a.toCharArray()){
            if (map.get(c) == null){
                //that means c is not in the map
                map.put(c, 1);
            } else {
                //c is already here!
                map.replace(c, map.get(c) + 1);
            }
        }
        System.out.println("AFTER CREATION:" + map);
        //verify that all of b is in a
        for (char c : b.toCharArray()){
            if (map.get(c) == null){
                return false;
            } else {
                map.replace(c, map.get(c) - 1);
            }
        }
        System.out.println("AFTER VERIFICATION: " + map);
        //also verify that all of a was in b
        for (char c : map.keySet()){
            if (map.get(c) != 0){
                return false;
            }
        }

        return true;
    }

}
