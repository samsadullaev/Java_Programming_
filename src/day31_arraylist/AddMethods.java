package day31_arraylist;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        System.out.println(letters.size());
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('z');
        System.out.println(letters.size());
        System.out.println(letters);

        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));

        letters.add(0, '$');
        System.out.println(letters);

        letters.add(3, '8');
        System.out.println(letters);





    }



}

