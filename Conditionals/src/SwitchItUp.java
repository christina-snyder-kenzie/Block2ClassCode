public class SwitchItUp {
    public static void main(String[] args) {
        String mood = "Ready";
        if (mood.equals("Energetic") || mood.equals("Ready")){
            System.out.println("Woohoo! Let's go!");
        } else if (mood.equals("Sleepy")){
            System.out.println("Go take a nap... or have a coffee");
        } else {
            System.out.println("I don't recognize that mood");
        }

        switch (mood) {
            case "Energetic", "Ready":
                System.out.println("Woohoo! Let's go!");
                break;
            case "Sleepy":
                System.out.println("Go take a nap... or have a coffee");
                break;
            default:
                System.out.println("I don't recognize that mood");
                break;
        }

        //30 days hath september, april, june, and november
        //all the rest have 31
        //except february which has 28..ish
        String month = "June";
        switch (month) {
            case "September", "April", "June", "November":
                System.out.println(month + " has 30 days.");
                break;
            case "February":
                System.out.println("February has 28ish days");
                break;
            default:
                System.out.println(month + " has 31 days.");
                break;
        }


    }
}
