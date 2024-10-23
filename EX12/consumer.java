package EX12;

public class consumer implements Runnable{
    private stock stk;
    private int consumptionquantity;

    public consumer(stock stk, int cq){
        this.stk = stk;
        this.consumptionquantity = cq;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 5;i++){
            try {
                stk.getstock(consumptionquantity);
                Thread.sleep(100);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
