class Payment {
    void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}
class CreditCardPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}
class PayPalPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
public class PaymentMode {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();

        p1.makePayment(100);
        p2.makePayment(200);
    }
}
