package mypackage;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + name + "(s) sold.");
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println(name + " restocked: " + quantity + " added.");
        }
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Stock: " + stock);
    }

    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200, 5);
        laptop.displayProduct();
        laptop.sellProduct(2);
        laptop.restock(3);
        laptop.displayProduct();
    }
}
