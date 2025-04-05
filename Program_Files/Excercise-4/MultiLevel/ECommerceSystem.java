class Order {
    void placeOrder() {
        System.out.println("Order placed successfully.");
    }
}
class Payment extends Order {
    void makePayment() {
        System.out.println("Payment completed successfully.");
    }
}
class Shipping extends Payment {
    void shipOrder() {
        System.out.println("Order shipped successfully.");
    }
}
public class ECommerceSystem {
    public static void main(String[] args) {
        Shipping myOrder = new Shipping();
        
        myOrder.placeOrder();
        myOrder.makePayment();
        myOrder.shipOrder();
    }
}