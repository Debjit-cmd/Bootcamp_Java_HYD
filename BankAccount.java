package BankAccount;

class BankAccount1 {
    String accountHolder;
    double balance;
    double accountNumber;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println(balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        BankAccount1 acc = new BankAccount1();

        acc.accountHolder = "Vivek";
        acc.balance = 100000;
        acc.accountNumber = 938388383;

        acc.deposit(5000);
        acc.withdraw(20000);

        acc.displayBalance();
    }
}
