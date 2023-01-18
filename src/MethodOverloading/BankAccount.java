package MethodOverloading;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

    public BankAccount() {
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String number, double balance) {
        this(number, balance, "John Doe", "john.doe@email.com", "372 5555 5555");
        System.out.println("Constructor with partial parameters called.");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail,
                       String customerNumber) {

        System.out.println("Constructor with parameters called.");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit processed. " + depositAmount + " added. Balance is " + this.balance);
//        System.out.println("Deposit processed. " + String.format("%.2f", depositAmount) +
//                "€ added. Balance is " + String.format("%.2f", this.balance) + "€");
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
