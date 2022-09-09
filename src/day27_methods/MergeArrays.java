package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[][] nums = {
            {10, 20, 30},
            {5, 10, 15}
        };
        // to count total # elements, need to loop
        int size = 0;
        for(int[] eachArray : nums){
           size+= eachArray.length;
        }

        int[] merged = new int[size];
        int indexTOStore = 0;

        for(int[] eachArray : nums){
            for(int eachNum : eachArray){
                merged[indexTOStore++] = eachNum;

            }
            System.out.println(Arrays.toString(merged));
        }

    }

}
