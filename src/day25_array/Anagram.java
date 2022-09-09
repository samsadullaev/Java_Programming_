package day25_array;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "Listen";
        String word2 = "silent";



        char[] first = word1.toLowerCase().toCharArray();
        char[] second = word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        if (Arrays.equals(first, second)) {
            System.out.println("Anagram");

        } else {
            System.out.println("not");
        }

    }
}
