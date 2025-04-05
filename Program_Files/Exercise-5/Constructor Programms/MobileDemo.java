class Mobile {
    String brand;
    String model;
    double price;

    Mobile() {
        brand = "Samsung";
        model = "Galaxy S21";
        price = 799.99;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.displayInfo();
    }
}
