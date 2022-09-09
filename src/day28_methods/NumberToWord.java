package day28_methods;

public class NumberToWord {


    public static void main(String[] args) {
        System.out.println(numberToWord(3));
    }


    public static String numberToWord(int n) {
        String word = "";
        switch (3) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            default:
                word = "Invalid. We can only accept numbers from 1 - 7";
        }

        return word;

    }
}
