package day29_methods;

import java.util.Locale;

public class ExtraPractice {
    public static void main(String[] args) {
        int[] nums = {1, 24, 5, 12};
        System.out.println(sumFromArray(nums));

        System.out.println(currencyConvertor("yen", 100));

        String name = "lira";

    }
    /*
    create a method that accept an int array. Take the sum of all the numbers and return the sum
     */

    public static int sumFromArray(int[] nums){
        int sum = 0;
        for(int eachNum : nums){
            sum+= eachNum;
        }
        return sum;
    }

    public static double currencyConvertor(String type, double dollar){
        double converted = 0.0;
        switch(type.toLowerCase()){
            case "euro":
                converted = dollar * 0.91;
                break;
            case "yen":
                converted = dollar * 121.03;
                break;
            case "lira":
                converted =dollar * 14.85;
                break;
            case "won":
                converted =dollar * 1_217.52;
                break;
            case "repee":
                converted = dollar * 181.45;
                break;
            default:
                System.out.println("We cannot convert to " + type);


        }
        return converted;
    }



}
