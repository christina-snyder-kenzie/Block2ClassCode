package org.example;

public class Activity {
    public static int numActivitiesMade = 0;
    protected String name;

    public Activity(String name){
        this.name = name;
        numActivitiesMade++;
    }

    public void dew(){
        System.out.println("!!!I'm doing " + name + "!!!");
    }
}

class Exercise extends Activity {
    //convention -> a hard suggestion
    public static int totalCaloriesBurnedEver = 0;
    private final int MAX_TIME = 120;
    //final variables (constants) are written in ALL_CAPS with underscores

    //a call to super always MUST happen in the subclass
    //java gods TRY: super()
    private int caloriesBurned;

    public Exercise(String name){
        super(name);
        caloriesBurned = 0;
    }

    public void burnCalories(){
        caloriesBurned += 10;
        totalCaloriesBurnedEver += 10;
    }

    //override the dew method to NOT be excited.
    public void dew(){
        System.out.println("I'm doing " + name);
    }

    //overload the dew method to exercise for an amt of time
    public void dew(int amtOfTime){
        if (amtOfTime > MAX_TIME){
            return; //nope out
        }
        //there's 10% chance that no matter what, I do the max time
        if (Math.random() < .1){
            amtOfTime = MAX_TIME;
        }
        this.dew();
        for (int i = 0; i < amtOfTime; i++) {
            burnCalories();
        }

        double pi = Math.PI;
    }

    public int getCaloriesBurned(){
        return caloriesBurned;
    }
}