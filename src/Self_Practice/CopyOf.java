package Self_Practice;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {


        int[] bro = {12, 1, 3, 4, 6};
        System.out.println(Arrays.toString(bro));
        Arrays.sort(bro);
        System.out.println(Arrays.toString(bro));

        String [] names = { "sam", "alex", "latina", "bob"};
        String [] names2 = Arrays.copyOf(names, 2);
        System.out.println(Arrays.toString(names2));

        String str = "cydeo";
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('c'));

        String st = "woodon spoon";
        System.out.println(st);


        String s = " I will find the lost book";
        String word = "reverse ";
        for(int index = s.length()-1; index <= 0; index--){
        word+= s.charAt(index);

        }
        System.out.println(word);



    }
}