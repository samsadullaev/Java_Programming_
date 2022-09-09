package day35_constructor_classes;

public class Store {
    public static void main(String[] args) {

        Carpet cover = new Carpet(12.5, 35, 12.99, true);
        System.out.println(cover);

        Carpet persian = new Carpet(12.5, 35, 12.99, false);
        System.out.println(persian);

        persian.width = 16.5;
        persian.calculatePrice();
        System.out.println(persian);

    }
}
