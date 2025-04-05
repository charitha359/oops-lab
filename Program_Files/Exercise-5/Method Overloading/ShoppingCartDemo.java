class ShoppingCart {
   void addItem(String itemName) {
        System.out.println("Item added: " + itemName);
    }
    void addItem(String itemName, int quantity) {
        System.out.println("Item added: " + itemName + ", Quantity: " + quantity);
    }
    void addItem(String itemName, int quantity, double price) {
        System.out.println("Item added: " + itemName + ", Quantity: " + quantity + ", Total Price: $" + (quantity * price));
    }
}
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop");
        cart.addItem("Phone", 2);
        cart.addItem("Headphones", 3, 50.0);
    }
}
