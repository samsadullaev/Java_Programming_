package day38_encapsulation;

public class TestingAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //  System.out.println(obj.c); doesnt print bc its private
    }
}
