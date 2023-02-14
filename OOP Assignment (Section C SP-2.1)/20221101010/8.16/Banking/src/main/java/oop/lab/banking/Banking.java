
package oop.lab.banking;
import java.util.Scanner;

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */
public class Banking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the depositor: ");
        String name = scan.nextLine();
        System.out.print("Enter the account number: ");
        int accountNumber = scan.nextInt();
        System.out.print("Enter the type of account: ");
        scan.nextLine(); 
        String type = scan.nextLine();
        System.out.print("Enter the balance amount in the account: ");
        double balance = scan.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, type, balance);

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Display account details");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nAccount details:");
                    account.display();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scan.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    amount = scan.nextDouble();
                    account.deposit(amount);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}