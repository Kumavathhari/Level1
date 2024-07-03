package Level1;

public class Computer {
    String processor;
    int RAM;
    int storage;
    Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }
    double calculatePrice() {
        double basePrice = 500;
        double pricePerGB_RAM = 10;
        double pricePerGB_Storage = 0.5;

        if (processor.equalsIgnoreCase("Intel")) {
            basePrice += 200;
        } else if (processor.equalsIgnoreCase("AMD")) {
            basePrice += 150;
        }

        double RAMPrice = RAM * pricePerGB_RAM;
        double storagePrice = storage * pricePerGB_Storage;

        double totalPrice = basePrice + RAMPrice + storagePrice;
        return totalPrice;
    }
    void printComputerDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("InteL", 16, 512);
        System.out.println("Computer Details:");
        myComputer.printComputerDetails();
        double price = myComputer.calculatePrice();
        System.out.println("Price of the computer: $" + price);
    }
}
