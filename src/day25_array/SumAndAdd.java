package day25_array;

import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {

        int[] arr = {5, 1, 2};
        int sum = 0;

        for(int each : arr){
            sum+= each;

        }
        int[] newArray = Arrays.copyOf(arr,arr.length + 1);
        System.out.println(Arrays.toString(newArray));
        newArray[newArray.length - 1] = sum;
        System.out.println(Arrays.toString(newArray));
    }
}

