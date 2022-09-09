package day35_constructor_classes;

public class LocalVsInstance {
    int a = 5;
    int b = 10;

    public LocalVsInstance(int a, int z){
        a = a;

        b = z;
    }
    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance(20, 50);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
