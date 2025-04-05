class WaterBill {
    private int consumption; // Private variable for data security
    private static final double RATE_PER_UNIT = 2.5; // Fixed rate per unit

    public WaterBill(int consumption) {
        setConsumption(consumption); 
    }

       public int getConsumption() { 
        return consumption; 
    }
    public void setConsumption(int consumption) { 
        if (consumption >= 0) {
            this.consumption = consumption; 
        } else {
            System.out.println("Invalid consumption value. Cannot be negative.");
        }
    }

    public double getBillAmount() { 
        return consumption * RATE_PER_UNIT; 
    }
    public void displayBill() {
        System.out.println("Water Consumption: " + consumption + " units");
        System.out.println("Bill Amount: $" + getBillAmount());
    }
}
public class WaterBillingSystem {
    public static void main(String[] args) {
        WaterBill bill1 = new WaterBill(100);
        bill1.displayBill();
        
        bill1.setConsumption(-10); 
        bill1.setConsumption(150); 
        bill1.displayBill();
    }
}
