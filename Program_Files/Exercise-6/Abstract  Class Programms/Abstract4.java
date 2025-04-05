abstract class VehicleRegistration {
    String vehicleType;
    String owner;
    double baseFee;

    VehicleRegistration(String vehicleType, String owner, double baseFee) {
        this.vehicleType = vehicleType;
        this.owner = owner;
        this.baseFee = baseFee;
    }

    abstract void calculateRegistrationFee();

    void issueRegistration() {
        System.out.println("Registration issued for " + vehicleType + " owned by " + owner);
    }
}
class CarRegistration extends VehicleRegistration {
    CarRegistration(String owner, double baseFee) {
        super("Car", owner, baseFee);
    }
    void calculateRegistrationFee() {
        double totalFee = baseFee + (baseFee * 0.05); 
        System.out.println("Car Registration Fee for " + owner + ": $" + totalFee);
    }
}
class BikeRegistration extends VehicleRegistration {
    BikeRegistration(String owner, double baseFee) {
        super("Bike", owner, baseFee);
    }
    void calculateRegistrationFee() {
        double totalFee = baseFee + (baseFee * 0.03); 
        System.out.println("Bike Registration Fee for " + owner + ": $" + totalFee);
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        VehicleRegistration v1 = new CarRegistration("Alice", 500);
        VehicleRegistration v2 = new BikeRegistration("Bob", 200);

        v1.calculateRegistrationFee();
        v1.issueRegistration();

        v2.calculateRegistrationFee();
        v2.issueRegistration();
    }
}
