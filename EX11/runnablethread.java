package EX11;

import java.util.concurrent.TimeUnit;

public class runnablethread {
    public static class Hi implements Runnable{
        @Override
        public void run(){
            try {
                System.out.println("Hi");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    public static class AI implements Runnable{
        @Override
        public void run(){
            try {
                System.out.println("AI");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Runnable Hi = new Hi();
        Runnable Ai = new AI();

        Thread hiThread = new Thread(Hi);
        Thread aiThread = new Thread(Ai);

        hiThread.start();
        aiThread.start();
        
        try {
            hiThread.join();
            aiThread.join();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
