package day25_array;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] other = nums;

        nums[0] = 12;
        other[2] = 25;

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));

        int[] a = {5, 10, 15};
        int[] b = Arrays.copyOf(a, 3); // new array with size 3
        System.out.println("before");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[1] = 100;
        System.out.println("after");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
