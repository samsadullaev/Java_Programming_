package day23_For_Each;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many people coming");
        int size = input.nextInt();

        String[] names = new String[size];
        System.out.println(Arrays.toString(names));

        for(int i = 0; i < names.length; i++){
            System.out.println("enter name " + (i + 1));
            String guest = input.next();
            names[i] = guest;
        }
        System.out.println("final list");
        System.out.println(Arrays.toString(names));
    }

}
