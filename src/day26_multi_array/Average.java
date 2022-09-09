package day26_multi_array;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

       int totalSum = 0;
       int totalElements = 0;


        int[][] nums = {
                {3,5,1,2},
                {2,1,5,10,8},
                {3,1,5,12}
        };

        for(int[] eachInner : nums){ // looping through 2D array nums

            int sum = 0;

            for(int eachNum : eachInner){
                sum+= eachNum;

            }
            System.out.println(Arrays.toString(eachInner));
            System.out.println();
        }

    }
}
