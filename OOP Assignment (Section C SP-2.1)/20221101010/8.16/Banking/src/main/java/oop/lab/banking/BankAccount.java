
package oop.lab.banking;

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */
public class BankAccount {

    String name;
    int accountNumber;
    String accountType;
    double balance;

    public BankAccount(String name, int accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal unsuccessful.");
        }
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
