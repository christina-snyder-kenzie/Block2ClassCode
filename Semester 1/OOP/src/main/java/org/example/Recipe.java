package org.example;

import java.util.ArrayList;

/*
Papi's Rice:
"1 cup rice"
"2 cups water"
1 tsp salt

parallel arrays -> ARE DANGEROUS
amounts[] -> {1, 2, 1}
measurement[] -> {cup, cups, tsp}
name[] -> {rice, water, salt}

OOP approach?
ingredient object (amount, measurement, name)

ingredient[] -> [ingr1, ingr2, ingr3]

 */
public class Recipe {
    //properties
        //ingredients
            //measurements
            //amounts
            //name
        //steps + cooking method
        //cooking time
        //prep time?
        //name
        //servings?
    private ArrayList<Ingredient> ingredients;
    private String steps, name;
    private int cookTime, prepTime, totalTime;

    public Recipe(String name, int prepTime, int cookTime, String steps){
        this.name = name;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.steps = steps;
        totalTime = prepTime + cookTime;
        ingredients = new ArrayList<Ingredient>();
    }

    //setter method (mutator method) (updater)
    public void setCookTime(int newCookTime){
        cookTime = newCookTime;
        totalTime = cookTime + prepTime;
    }

    //getter method (accessor method)
    //public dataType getProperty() {return property;}
    public String getName(){
        return name;
    }

    public int getCookTime(){
        return cookTime;
    }

    public void setName(String newName){
        name = newName;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
//encapsulation -> the process by which we provide a public interface
    //while hiding implementation details

        //the idea that I dont know how it works...
        //but I can use it

    //public interface
        //the buttons

    //Kitchen Oven
    //Strings
        //public interface: substring, charAt, length, etc

    public void addIngr(double amount, String measurement, String name){
        Ingredient toAdd = new Ingredient(amount, measurement, name);
        ingredients.add(toAdd);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(name);
        sb.append("\nPrep Time: " + prepTime);
        sb.append("\nCook Time: " + cookTime);
        sb.append("\nTotal Time: " + totalTime);
        sb.append("\n-------------------");
        for (Ingredient curr : ingredients){
            sb.append("\n" + curr.toString()); //the .toString() is optional
        }
        sb.append("\n-------------------");
        sb.append("\n" + steps);
        return sb.toString();
    }

    public void scale(double factor){
        //GOAL: update the recipe by multiplying amounts by the factor
        for (Ingredient curr : ingredients){
            //curr.amount *= factor;
            //what if amount was private though?

            double oldAmount = curr.getAmount();
            double updated = oldAmount * factor;
            curr.setAmount(updated);

            //curr.setAmount(curr.getAmount() * factor);
        }
    }

}
