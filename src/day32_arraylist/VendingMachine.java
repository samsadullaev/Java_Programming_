package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Soda", "Juice", "Water", "Coffee"));
        System.out.println("which drink");
        String selection = input.next();// StringUtil.fixFormat(input.next())

        if(drinks.contains(selection)){
            System.out.println(selection + " vending");
        } else{
            System.out.println(selection + " not available");
        }


    }
}
