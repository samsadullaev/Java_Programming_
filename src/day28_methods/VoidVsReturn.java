package day28_methods;

public class VoidVsReturn {

    public static void main(String[] args) {
        sayHello();
        sayBye();
        System.out.println(sayBye());
    }
    public static void sayHello(){
        System.out.println("hello");
    }

    public static String sayBye(){
        return "Bye";
    }
}
