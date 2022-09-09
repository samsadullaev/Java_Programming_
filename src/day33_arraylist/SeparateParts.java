package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG";
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(s.split("")));
        letters.removeIf(p -> !Character.isLetter(p.charAt(0)));
        System.out.println(letters);

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(s.split("")));
        numbers.removeIf(each -> !Character.isDigit(each.charAt(0)));
        System.out.println(numbers);

        ArrayList<String> special = new ArrayList<>(Arrays.asList(s.split("")));
        special.removeAll(letters);
        special.removeAll(numbers);
        System.out.println(special);    }
}
