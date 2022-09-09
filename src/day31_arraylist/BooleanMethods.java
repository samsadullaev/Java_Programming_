package day31_arraylist;

import java.util.ArrayList;

public class BooleanMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);
        System.out.println("is empty " + list.isEmpty());

        System.out.println("contains " + list.contains(41));


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);

        System.out.println(" equals " + list.equals(list2));

    }

}
