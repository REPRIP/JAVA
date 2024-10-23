package EX12;

public class Main {
    public static void main(String[] args) {
        stock st = new stock();
        producer p = new producer(st, 1);
        consumer c = new consumer(st, 1);

        Thread producerThread = new Thread(p);
        Thread consumerThread = new Thread(c);

        producerThread.start();
        consumerThread.start();

        try{
        producerThread.join();
        consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    
    }
}
