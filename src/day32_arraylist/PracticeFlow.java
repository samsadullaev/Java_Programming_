package day32_arraylist;

import java.util.ArrayList;

public class PracticeFlow {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        words.add("Shoes");
        words.add(1, "Jacket");
        words.add(0, "Towel");
        words.add(1, "Car");
        System.out.println(words);


        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");
        System.out.println(avengers);

      int index = avengers.indexOf("Thor");
        System.out.println(index);
        avengers.remove(index);
        System.out.println(avengers);

        avengers.remove("Iron Man");
        System.out.println(avengers);

        // removing an Integer ArrayList

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);
        nums.remove((Integer) 300);
        System.out.println(nums);
        nums.remove(nums.lastIndexOf(300));
        System.out.println(nums);






    }
}
