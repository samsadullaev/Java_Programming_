package day41_exceptions;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 5);
            String s = null;
            s.trim();

        }catch (ArithmeticException e) {
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("second");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end");





    }
}
