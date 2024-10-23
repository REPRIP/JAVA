package EX7;

public class Catch {
    public static void main(String[] args) {
        int size = -5;

        try{
            int[] array = new int[size];
            System.out.println("Array created!");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Cannot create array with negative size");
        }
    }
}
