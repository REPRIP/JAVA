package ques6;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount(1000.0);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.calculateInterest();
                    break;
                case 4:
                    System.out.println("Current balance: " + account.viewBalance());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    scanner.close();
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
