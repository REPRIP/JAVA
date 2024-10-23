package EX12;

public class stock {
    private int quantity;

    public synchronized void addstock(int quantity){
        this.quantity += quantity;
        System.out.println("Producer added " + quantity + " items. \nCurrent stock: " + this.quantity);
        notifyAll();
    }

    public synchronized void getstock(int quantity) throws InterruptedException {
        while(this.quantity < quantity){
            System.out.println("Consumer is waiting for stock to be updated...");
            wait();
        }
        this.quantity -= quantity;
        System.out.println("Consumer consumed " + quantity + " items.\nCurrent stock: " + this.quantity);
    }

    public synchronized int getQuantity() {
        return quantity;
    }
}
