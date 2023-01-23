package org.example;

import java.util.ArrayList;

public class CarTester {
    public static void main(String[] args) {
        Car twoDoor = new Car("abc123", 55000, 2);
        Car miniVan = new Car("xyz321", 7500, 7);
        Car taurus = new Car("123abc456", 1200, 6);

        System.out.println(twoDoor);
        System.out.println(miniVan);
        System.out.println(taurus);

        Dealership jimEllis = new Dealership();
        jimEllis.addCar(twoDoor);
        jimEllis.addCar(miniVan);
        jimEllis.addCar(taurus);

        ArrayList<Car> affordable = jimEllis.findCarsUnderBudget(8000);
        System.out.println(affordable);

        System.out.println(jimEllis.findCarsWithSeats(2));
    }
}
