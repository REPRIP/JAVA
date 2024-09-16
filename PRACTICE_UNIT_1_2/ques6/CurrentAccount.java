package ques6;

public class CurrentAccount implements Account {
    private double balance;
    private double interestPercent = 0.035;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public double calculateInterest() {
        double interestAmount = balance * interestPercent;
        balance += interestAmount;
        System.out.println("Interest Amount is: " + interestAmount);
        return balance;
    }

    public double viewBalance() {
        return balance;
    }   
}