package BankingApplication;

public class Account {
    //  Encapsulation: Keeping fields private
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor for account initialization
    public Account(String number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //  Deposit Method
    public void depositMoney(double amount) {
        if (amount <= 0) {
            System.out.println(" Deposit amount must be greater than 0.");
            return;
        }
        this.balance += amount;
        System.out.println(" Deposit successful. New balance: " + this.balance);
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Withdrawal amount must be greater than 0.");
        } else if (this.balance < amount) {
            System.out.println("Insufficient balance. Current balance: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println(" Withdrawal successful. New balance: " + this.balance);
        }
    }

    //  Account Summary
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + number);
        System.out.println("Account Holder: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------\n");
    }

    //  Getters and Setters
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
