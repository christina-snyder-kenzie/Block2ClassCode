package org.example;

public class HULU {
    public static void main(String[] args) {
        TVShow show1 = new TVShow("Bob's Burgers", 14, 20, "PG");
        System.out.println(show1);
        System.out.println(show1.calculateTotalEpisodes());

        TVShow show2 = new TVShow("Cutthroat Kitchen", 10, 12);
        System.out.println(show2);
    }
}
