package day35_constructor_classes;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputPersian) {
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();


    }

    public void calculatePrice() {
        totalPrice = width * length * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }
    }


    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                "," + (isPersian ? " persian " : "regular") + "carpet " +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

