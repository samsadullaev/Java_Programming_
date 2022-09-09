package day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {

        int[] a = {4, 2, 1};
        System.out.println("elements" + a.length);
        System.out.println("print" + Arrays.toString(a));
        System.out.println("first element" + a[0]);
        System.out.println("add element to the array");
        System.out.println("remove element");
        System.out.println("array can hold objects and primitive types");

        System.out.println("--------");

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("# of elements: " + nums.size());
        System.out.println("print whole arrays " + nums);
        System.out.println("adding to array");
        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());


    }
}
