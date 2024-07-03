package Level1;

public class Phone {
    String make;
    String model;
    int storage;


    Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    double calculatePrice() {
        double basePrice = 300;
        double additionalPricePerGB = 10;

        double storagePrice = storage * additionalPricePerGB;

        if (make.equalsIgnoreCase("Apple") && model.equalsIgnoreCase("iPhone")) {
            basePrice += 200;
        } else if (make.equalsIgnoreCase("Samsung")) {
            basePrice += 150;
        }

        double totalPrice = basePrice + storagePrice;
        return totalPrice;
    }

    void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storage + " GB");
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone("Samsung", "Galaxy S21", 128);

        double price = myPhone.calculatePrice();
        System.out.println("Price of the phone: $" + price);

        System.out.println("\nPhone Details:");
        myPhone.printPhoneDetails();
    }
}
