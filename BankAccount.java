import java.util.Scanner;

public class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a new bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000);

        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Display welcome message and initial balance
        System.out.println("Welcome to the Bank Account System!");
        System.out.println("Current Balance: " + account.getBalance());

        while (true) {
            // Display menu options
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();

            // Perform action based on the user's choice
            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    // Check balance
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the Bank Account System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    // Invalid option
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
