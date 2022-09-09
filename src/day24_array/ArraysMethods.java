package day24_array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] nums = {32, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min: " + nums[0]);
        System.out.println("max: " + nums[nums.length - 1]);

        String[] strs = {"Hello", "world", "4four", "#zebra", "apple", "1aaaaa"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        int[] a = {1, 2, 3,};
        int[] b = {1, 2, 3,};
        int[] c = {1, 2, 3,};
        int[] d = {1, 2, 4,};
        int[] e = {3, 2, 1,};

        Arrays.sort(e);
        System.out.println(Arrays.equals(a, e));

        System.out.println("-----------");
        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ~ ");
            }
            System.out.println();
        }

        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(i);

            if (i == 'C') {
                break;
            }
        }

    }
}





