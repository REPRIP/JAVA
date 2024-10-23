public class Genadd <T extends Number>{
    private T new1;
    private T new2;

    Genadd(T num1, T num2){
        this.new1 = num1;
        this.new2 = num2;
    }

    public T addT(){
        return (T)(Integer)(new1.intValue() + new2.intValue());
    }
    public static void main(String[] args) {
        Genadd<Integer> myObj = new Genadd<Integer>(1, 2);
        System.out.println(myObj.addT());
    }
}
