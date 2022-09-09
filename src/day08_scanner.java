public class day08_scanner {
    public static void main(String[] args) {
        /**
         * If n number diveide 5 is Buzz number
         * If n number diveide 3 is Fizz number
         * If n number diveide 5 and 3 is FizzBuzz number
         * If n number is not diveide invalid numnber
         */
        /*
        int n = 15;
        if (n % 5 && n % 3 )
            System.out.println("FizzBuzz");
        if (n % 5 == 3)
            System.out.println("Fizz ");
        if (n % 3 == 5)
            System.out.println("Buzz");

    } else { (n % 5 ==0 && n % 3 ==0)
            System.out.println(" invalid number ");

         */

      /*  int n = 24;
        if(n%4==0 && n%6==0){
            System.out.println("FizzBuzz");
        }else if(n%4==0){
            System.out.println("Fizz");
        }else if(n%6==0){
            System.out.println("Buzz");
        }else{
            System.out.println("Invalid number");
        }


       */

        int n = 100;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even number ");
            } else {
                System.out.print(i + " Odd number | ");
            }


        }
    }
}

