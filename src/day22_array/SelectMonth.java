package day22_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"};
        System.out.println("Enter the month number");
        int num = input.nextInt();

        if(num >=1 && num <=12){
        System.out.println(months[num - 1]);

    } else {
        System.out.println("Invalid month number");
    }

    }
}
