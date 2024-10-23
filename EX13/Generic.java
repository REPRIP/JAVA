import java.util.*;

public class Generic <T extends Number> {
    private List<T> nums;

    Generic(List<T> Nums){
        this.nums = Nums;
    }

    public void returnSum(){
        double oddsum = 0;
        double evensum = 0;
        for (T t : nums) {
            if (t.doubleValue() % 2 == 0){
                evensum += t.doubleValue();
            } else {
                oddsum += t.doubleValue();
            }
        }
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
    }

    public static void main(String[] args) {
        List<Integer> N = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Double> N1 = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
        Generic<Integer> myObj = new Generic<Integer>(N);
        Generic<Double> myObj1 = new Generic<Double>(N1);

        myObj.returnSum();
        myObj1.returnSum();
    }
}


