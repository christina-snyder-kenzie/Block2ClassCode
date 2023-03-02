package org.example;

public class FirstTry {
    public static void main(String[] args) {
        String[] toppings = new String[5];
        toppings[0] = "peppers";
        toppings[1] = "onions";
        toppings[2] = "ham";

        for (String topping : toppings){
            try {
                if (topping.equals("onions")){
                    throw new IllegalArgumentException("Onions not legal");
                }
                if (topping.length() < 5){
                    throw new TeenyTinyException(topping);
                }
                System.out.println(topping.length()); //throws a npe on the last 2
                System.out.println(15 / 0);
            } catch (TeenyTinyException t) {
                System.out.println(t.getMessage());
            } catch (NullPointerException npe){
                System.out.println("Oopsie- we have a null");
            } catch (Exception e){
                System.out.println("An error occurred- you silly goose");
                System.out.println(e.getMessage());
                e.printStackTrace();
            } finally {
                //happens at the end of a try catch ALWAYS
                //different from an else
                System.out.println("Finally!");
            }
        }

    }

    public static void method(int x) throws Exception { //making it someone else's problem
                                                        //passing the responsibility to another method
        //does something dangerous

        //option 1: handle it in a try catch
        //option 2: Don't handle it, say we MIGHT throw an error (with throws)
    }
}
