NAME: NICHOLAS KYALO 
REG NO: S08-8425-2024

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        this.price -= (this.price * (percentage / 100));
    }

    // Method to get updated price
    public double getPrice() {
        return price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Product: " + name + ", Price after discount: Ksh " + price);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Product object
        Product product = new Product("Laptop", 50000.0);

        // Ask user for discount percentage
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        // Apply discount and display new price
        product.applyDiscount(discount);
        product.displayDetails();
    }
}