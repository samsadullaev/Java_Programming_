package day30_practice_wrapper;
import my_utils.ArraysUtil;

public class UsingArraysUtilClass {
    public static void main(String[] args) {

        int []a = {45, 2, 6, 2, 6, 23};
        System.out.println(ArraysUtil.max(a));

        System.out.println("difference between using [] and ...");


        int num = ArraysUtil.min(4, 2, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(num);

        int []b = { 4, 5, 3, 2, 5,};
        System.out.println(ArraysUtil.contains(b, 5));
    }



}