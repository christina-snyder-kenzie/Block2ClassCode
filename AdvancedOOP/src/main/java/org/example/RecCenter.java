package org.example;

public class RecCenter {
    public static void main(String[] args) {
        Activity a1 = new Activity("Dancing");
        a1.dew();
        String s = a1.name;

        Craft c1 = new Craft("Cross Stitching");
        c1.buySupply("Thread", 2, "Pink");
        c1.buySupply("Thread", 2, "Yellow");
        c1.buySupply("Thread", 10, "Yellow");
        //exepct to see 12 yellows...
        c1.dew();


        Exercise e1 = new Exercise("Running");
        e1.dew(30);
        System.out.println(e1.getCaloriesBurned());
        System.out.println("Total so far: " + Exercise.totalCaloriesBurnedEver);

        Exercise e2 = new Exercise("Zumba");
        e2.dew(60);
        System.out.println(e2.getCaloriesBurned());
        System.out.println("Total so far: " + Exercise.totalCaloriesBurnedEver);
        e2.dew(60);
        System.out.println(e2.getCaloriesBurned());
        System.out.println("Total so far: " + Exercise.totalCaloriesBurnedEver);
        System.out.println(Activity.numActivitiesMade);
    }
}
