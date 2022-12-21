package Lab.BankAccount;

public class BankAccount {


    private final static double DEFAULT_INTEREST_RATE = 0.2;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private final int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccountCount;
        bankAccountCount++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public int getId() {
        return id;
    }
}
