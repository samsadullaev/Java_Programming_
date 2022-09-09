package day22_array;

import java.util.Arrays;
import java.util.Scanner;

public class Tets {
    public static void main(String[] args) {

       int[] nums = {4, 213, 6};
        System.out.println(Arrays.toString(nums));
        System.out.println("hardcode");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        System.out.println("With for loop");

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        // create own print format
        System.out.println(" our own format");
        String arrayAsString = "Array - ";
        for(int i = 0; i < nums.length; i++){
            arrayAsString+= nums[i] + " | ";

        }
        arrayAsString += " - End";
        System.out.println(arrayAsString);

        // go through with for each loop
        System.out.println("For each loop");

        for (int eachNumber : nums){
            System.out.println(eachNumber);// eachNumber == nums[i]


        }









    }
}
