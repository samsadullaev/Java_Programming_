package day26_multi_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {


        String[][] cydeo = {
                {"Alen", "Tina", "Alena", "Nargiza"},
                {"Anam", "Baz", "Busra", "Ostap"},
                {"Rabia", "Shahad"},
                {"Ketino", "Eylul", "Nadia"}

        };
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println(cydeo.length);
        System.out.println(cydeo[2].length);
        System.out.println(cydeo[0][3]);
        System.out.println(Arrays.toString(cydeo[1]));

        for (String[] eachInner : cydeo) {
            System.out.println(Arrays.toString(eachInner));
        }


        System.out.println();

        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.println(eachName);
            }

        }


    }
}

