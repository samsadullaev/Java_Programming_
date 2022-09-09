package day23_For_Each;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {

    public static void main(String[] args) {
        // have all info
        String[] studentOne = {"04", "Kristina", "Gaidamovic", "27"};
        System.out.println(Arrays.toString(studentOne));
        //know number of elements
        String[] studentTwo = new String[4];
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Kravetska";
        studentTwo[3] = "27";
        System.out.println(Arrays.toString(studentTwo));

       // know elements, and add from scanner
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("enter id");
        studentThree[0] = input.next();
        System.out.println("enter first name");
        studentThree[1] = input.next();
        System.out.println("last name");
        studentThree[2]= input.next();
        System.out.println("batch");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));

        // most dynamic

        String[] studentFour = new String[4];
        String[] questions = {"id", "first name", "last name", "batch number"};
        for(int i = 0; i < studentFour.length; i++) {
            System.out.println("Enter your" + questions[i]);
            studentFour[i] = input.next();
        }
        System.out.println(Arrays.toString(studentFour));
    }
}
