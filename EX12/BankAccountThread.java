package EX12;

public class BankAccountThread extends Thread{
    private BankAccount Account;
    private double amount;
    private boolean isDeposit;

    public BankAccountThread(BankAccount account, double amount, boolean isDeposit){
        this.Account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run(){
        if(isDeposit){
            Account.deposit(amount);
            System.out.println("Deposited: " + amount + "/-");
        } else {
            try{
                Account.withdraw(amount);
                System.out.println("Withdrawn " + amount + "/-");
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
