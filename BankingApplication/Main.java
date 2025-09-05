package BankingApplication;

public class Main {
    public static void main(String[] args) {
        // Creating an Account
        Account srijaAccount = new Account("123456", 0.0, "Srija", "srijaa@gmail.com", "1234567890");

        // Banking Operations
        srijaAccount.displayAccountDetails();

        srijaAccount.depositMoney(1234);
        srijaAccount.depositMoney(12);

        srijaAccount.withdraw(1235);
        srijaAccount.withdraw(50);

        srijaAccount.displayAccountDetails();
    }
}
