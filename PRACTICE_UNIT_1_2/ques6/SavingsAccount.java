package ques6;

import java.util.Scanner;

public class SavingsAccount {
    private double balance;
    private double interestPercent = 0.07;
    private static Scanner scanner = new Scanner(System.in);

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully Current balance: " + balance);
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void calculateInterest() {
        double interestAmount = balance * interestPercent;
        balance += interestAmount;
        System.out.println("Interest amount is: " + interestAmount);
        System.out.println("New balance after adding interest: " + balance);
    }

    public double viewBalance() {
        return balance;
    }
}