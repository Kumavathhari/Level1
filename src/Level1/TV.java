package Level1;

public class TV {
    String brand;
    int size;
    double price;

    TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    double calculateDiscount() {
        double discountPercent;
        if (size <= 32) {
            discountPercent = 5;
        } else if (size <= 55) {
            discountPercent = 10;
        } else {
            discountPercent = 15;
        }

        double discountedPrice = price - (price * discountPercent / 100);
        return discountedPrice;
    }

    void printTVDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        TV myTV = new TV("Toshiba", 50, 800);

        System.out.println("TV Details:");
        myTV.printTVDetails();
    }
}
