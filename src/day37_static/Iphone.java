package day37_static;

public class Iphone {
    String model;
    String color;
    double price;
    int storage;

    static String os;
    static String brand;

    static{
        os= "IOS";
        brand = "Apple";
    }
    public Iphone(String model, String color, double price, int storage){
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
