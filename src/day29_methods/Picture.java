package day29_methods;

public class Picture {
    public static void main(String[] args) {
        draw();
        draw("red");
        draw(10);
        draw("blue", " red");
        draw("blue", 10);


    }


    public static void draw(){
        System.out.println("drawing");
    }
    public static void draw(String color){

        System.out.println("drawing with " + color);
    }

    public static void draw(int size){

        System.out.println("making picture of "+ size);
    }
    public static void draw(String s, String s2){
        System.out.println("drawing " +  s + s2);
    }
    public static void draw(String s, int i){
        System.out.println(s + i);
    }
}
