package org.example;

public class CookBook {
    public static void main(String[] args) {
        Recipe r1 = new Recipe("Papi's Rice", 1, 25, "heat oil, add rice, water, salt, boil.");
        r1.addIngr(1, "TBSP", "Veg. Oil");
        r1.addIngr(1, "Cup", "Rice");
        r1.addIngr(2, "Cups", "Water");
        r1.addIngr(1, "tsp", "Salt");

        System.out.println(r1);

        //r1.cookTime = 20;
        r1.setCookTime(20);

        System.out.println(r1);

        //System.out.println(r1.name);
        System.out.println(r1.getName());

        Ingredient first = r1.getIngredients().get(0);
        System.out.println(first.getName());

        r1.scale(3);
        System.out.println(r1);
    }
}
