//NAME: NICHOLAS KYALO 
//REG .NO:S08-8425-2024

class CoffeeOrder {
    private String size;
    private double price;

    // Constructor
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Coffee Size: " + size + ", Price: Ksh " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two CoffeeOrder objects
        CoffeeOrder order1 = new CoffeeOrder("Large", 250.0);
        CoffeeOrder order2 = new CoffeeOrder("Small", 150.0);

        // Display details
        order1.displayDetails();
        order2.displayDetails();
    }
}