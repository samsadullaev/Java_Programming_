package day24_array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


        String s = "hello world";
        char[] letters = s.toCharArray();
        System.out.println(Arrays.toString(letters));

        System.out.println(letters[0]);

        for(char eachLetter : s.toCharArray()){
            System.out.println(eachLetter);
        }
        System.out.println();


        String str = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";
        System.out.println(Arrays.toString(str.split(",")));

        for(String eachDay : str.split(",")) {
            System.out.println(eachDay);

        }

        String month = "jan-feb-mar-june-july";
        String[] months = month.split("-");

        for( String eachMonth : months){
            System.out.println(eachMonth);
        }

        String str3="Mississippi";
        System.out.println(Arrays.toString(str3.split("si")));

    }
}

