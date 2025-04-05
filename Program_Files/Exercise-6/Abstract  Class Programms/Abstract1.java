abstract class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract void applyDiscount();
void showPrice() {
        System.out.println(name + " costs $" + price);
    }
}
class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }
    void applyDiscount() {
        System.out.println(name + " after discount: $" + (price - (price * 0.10)));
    }
}
class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }
    void applyDiscount() {
        System.out.println(name + " after discount: $" + (price - (price * 0.20)));
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 1000);
        Product p2 = new Clothing("Jacket", 200);

        p1.applyDiscount();
        p2.applyDiscount();
    }
}
