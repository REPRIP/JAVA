package EX11;

import java.util.concurrent.TimeUnit;

public class weatherThread extends Thread{
    private String weatherCondition;

    public weatherThread(String w){
        this.weatherCondition = w;
    }


    @Override
    public void run(){
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Today is " + weatherCondition);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args){

        //Create the thread objects
        weatherThread thread1 = new weatherThread("hot");
        weatherThread thread2 = new weatherThread("humid and sunny");

        //Initialize and start the threads
        thread1.start();
        thread2.start();

        //Wait for Completion of threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
