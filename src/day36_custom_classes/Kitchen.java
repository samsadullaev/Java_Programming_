package day36_custom_classes;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {
        Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));
        Food apples = new Food("Apples");
        allFood[0] = apples;
        allFood[1] = new Food("sushi", 10);
        allFood[2] = new Food("Cajun Pasta", 2, 3.99);
        allFood[3] = new Food("banana", 5, 2.5);
        allFood[4] = new Food("kebab", 4, 2.99);
        double total=0;
        System.out.println(Arrays.toString(allFood));

        for (Food each : allFood) {
            System.out.println(each);
        }
        System.out.println("food starts with a or c");
        for (Food each : allFood) {
            if (each.name.startsWith("A") || each.name.startsWith("C")) {
                System.out.println(each.name);
            }
        }
            System.out.println("food that is over 9$");
            for(Food each : allFood){
                if(each.totalPrice >=9){
                    System.out.println(each.name);
                }
            }
                for(Food each : allFood){

                }

        }
    }


