package cherry;

public class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());
        account.deposit(200);    
        account.withdraw(150);  
        account.withdraw(1200); 
        account.deposit(-50);   
        System.out.println("Final Balance: $" + account.getBalance());
    }
}












