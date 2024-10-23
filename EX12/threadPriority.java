package EX12;

public class threadPriority {
    public static class MyRunnable implements Runnable{
        private String name;
        public MyRunnable(String name){
            this.name = name;
        }
    
        @Override
        public void run(){
            for (int i = 0; i < 5 ;i++){
                System.out.println(name + " is running...");
                try {
                    Thread.sleep(1000); // sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    
    public static void main(String[] args){
        Thread thread1 = new Thread(new MyRunnable("Thread-1"));
        Thread thread2 = new Thread(new MyRunnable("Thread-2"));
        Thread thread3 = new Thread(new MyRunnable("Thread-3"));

        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.MAX_PRIORITY); // 10

        System.out.println("\nThread priorities:");
        System.out.println("Thread-1 priority: " + thread1.getPriority());
        System.out.println("Thread-2 priority: " + thread2.getPriority());
        System.out.println("Thread-3 priority: " + thread3.getPriority());

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
