package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MorePractice {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mutasem", "Baz", "Anam", "Tina", "Manziha",
                "Busra", "Reem", "Farzona", "Marjan"));

        ArrayList<String> bh = new ArrayList<>(names);
        bh.removeIf(name -> name.length() > 5);

        System.out.println(bh);

        ArrayList<String> byFirst = new ArrayList<>(names);
        byFirst.removeIf( p -> p.startsWith("M") || p.startsWith("B") );
        System.out.println(byFirst);

        ArrayList<String> endWith = new ArrayList<>(names);
        endWith.removeIf(str -> !str.endsWith("a"));
        System.out.println(endWith);

        System.out.println("-----------------------");
        System.out.println(names);

        /*
        for(String each : names){

            System.out.print(each);
            */

         names.forEach(each -> System.out.println(each));
         names.forEach(name -> System.out.println(name.charAt(0) + " " + name.charAt(name.length() - 1)));


        }

    }

