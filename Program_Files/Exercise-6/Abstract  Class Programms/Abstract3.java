abstract class MobileRecharge {
    String operator;
    double amount;

    MobileRecharge(String operator, double amount) {
        this.operator = operator;
        this.amount = amount;
    }
    abstract void recharge();

    void confirmRecharge() {
        System.out.println("Recharge of $" + amount + " is successful with " + operator);
    }
}
class AirtelRecharge extends MobileRecharge {
    AirtelRecharge(double amount) {
        super("Airtel", amount);
    }
    void recharge() {
        double serviceFee = amount * 0.02;
        System.out.println("Airtel Recharge: Final amount after service fee = $" + (amount - serviceFee));
    }
}
class JioRecharge extends MobileRecharge {
    JioRecharge(double amount) {
        super("Jio", amount);
    }
    void recharge() {
        double serviceFee = amount * 0.015;
        System.out.println("Jio Recharge: Final amount after service fee = $" + (amount - serviceFee));
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        MobileRecharge recharge1 = new AirtelRecharge(100);
        MobileRecharge recharge2 = new JioRecharge(200);

        recharge1.recharge();
        recharge1.confirmRecharge();

        recharge2.recharge();
        recharge2.confirmRecharge();
    }
}
