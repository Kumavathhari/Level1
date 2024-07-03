package Level1;

public class Furniture {
    String type;
    String material;
    double price;

    Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    double calculateDiscount() {
        double discountPercent;
        if (material.equalsIgnoreCase("wood")) {
            discountPercent = 10;
        } else if (material.equalsIgnoreCase("metal")) {
            discountPercent = 15;
        } else {
            discountPercent = 5;
        }

        double discountedPrice = price - (price * discountPercent / 100);
        return discountedPrice;
    }
    void printFurnitureDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        Furniture myFurniture = new Furniture("Chair", "Wood", 100);

        System.out.println("Furniture Details:");
        myFurniture.printFurnitureDetails();
    }
}
