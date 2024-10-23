package EX12;

public class producer implements Runnable{
    private stock stk;
    private int productionquantity;

    public producer(stock stk, int pq){
        this.stk = stk;
        this.productionquantity = pq;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 5;i++){
            stk.addstock(productionquantity);
            try {
                Thread.sleep(100);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
