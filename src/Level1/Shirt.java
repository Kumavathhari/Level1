package Level1;

public class Shirt {
    String size;
    String color;
    double price;

    Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    double calculateSizeDiscount() {
        double discountPercent;
        if (size.equalsIgnoreCase("small")) {
            discountPercent = 5;
        } else if (size.equalsIgnoreCase("medium")) {
            discountPercent = 10;
        } else {
            discountPercent = 15;
        }

        double discountedPrice = price - (price * discountPercent / 100);
        return discountedPrice;
    }

    double calculateColorDiscount() {
        double discountPercent;
        if (color.equalsIgnoreCase("red")) {
            discountPercent = 8;
        } else if (color.equalsIgnoreCase("blue")) {
            discountPercent = 6;
        } else {
            discountPercent = 4;
        }

        double discountedPrice = price - (price * discountPercent / 100);
        return discountedPrice;
    }

    void printShirtDetails() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Discounted Price: $" + calculateSizeDiscount());
    }

    public static void main(String[] args) {
        Shirt myShirt = new Shirt("medium", "red", 20);

        System.out.println("Shirt Details:");
        myShirt.printShirtDetails();
    }
}
