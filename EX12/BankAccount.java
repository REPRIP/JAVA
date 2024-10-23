package EX12;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount){
        balance += amount;
        notifyAll();
    }

    public synchronized void withdraw(double amount) throws InterruptedException {
        while (balance < amount){
            System.out.println("Low Balance!! Waiting for Deposit");
            wait(); 
        }
        balance -= amount;
    }

    public synchronized double getBalance(){
        return balance;
    }
}
