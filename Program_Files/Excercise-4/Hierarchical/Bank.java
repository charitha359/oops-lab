class Account {
    void showAccountDetails() {
        System.out.println("This is a bank account");
    }
}
class SavingsAccount extends Account {
    void addInterest() {
        System.out.println("Interest added to savings account");
    }
}
class CurrentAccount extends Account {
    void processBusinessTransaction() {
        System.out.println("Processing business transaction");
    }
}
class FixedDepositAccount extends Account {
    void calculateMaturityAmount() {
        System.out.println("Calculating fixed deposit maturity amount");
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();
        FixedDepositAccount fd = new FixedDepositAccount();

        savings.showAccountDetails();
        savings.addInterest();

        current.showAccountDetails();
        current.processBusinessTransaction();

        fd.showAccountDetails();
        fd.calculateMaturityAmount();
    }
}
