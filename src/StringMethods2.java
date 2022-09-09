import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {


        String word = "java";
        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("ja"));

        System.out.println("-------------------");

        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("java"));
        System.out.println(word.endsWith("va"));


        System.out.println("----------------------");


        String str = "today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today))" + str.contains("today"));
        System.out.println(str.contains("it is"));
        System.out.println(str.contains("80") && str.contains("today"));
        System.out.println(str.contains("day"));
        System.out.println(str.contains("to") && str.contains("rees"));

        System.out.println("-------------");

        String s = "java";
        //          0123
        System.out.println("First char " + s.charAt(0));

        System.out.println(s.length( ));
        System.out.println("" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0));


    }
}