package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethod {
    public static void main(String[] args) {

        ArrayList< String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        words.remove(2);
        System.out.println(words);
        System.out.println(words.indexOf("flying"));

        System.out.println(words.remove(0));
        System.out.println(words);

        words.clear();
        System.out.println(words);

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        words.remove("barn");
        System.out.println(words);
        System.out.println(words.remove("chicken"));

        System.out.println("--------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);
        nums.remove(0);
        System.out.println(nums);

        Integer a = 0;
        nums.remove(a);
        System.out.println(nums);

        nums.remove((Integer)2);
        System.out.println(nums);



    }
}
