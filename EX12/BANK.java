package EX12;

public class BANK {
    public static void main(String[] args){
    BankAccount account = new BankAccount(1000);

    BankAccountThread deposit1 = new BankAccountThread(account, 500, true);
    BankAccountThread deposit2 = new BankAccountThread(account, 700, true);

    BankAccountThread withdraw1 = new BankAccountThread(account, 500, false);
    BankAccountThread withdraw2 = new BankAccountThread(account, 200, false);
    

    deposit1.start();
    deposit2.start();
    withdraw1.start();
    withdraw2.start();

    try {
        deposit1.join();
        deposit2.join();
        withdraw1.join();
        withdraw2.join();
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }

    // Print final balance
    System.out.println("Final balance: $" + account.getBalance());
    }
}
