package EX7;

public class multipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[1];
            int b = 0;
            //int c = 10 / b; // This will throw ArithmeticException
            System.out.println("Access element three: " + numbers[3]); // This will throw ArrayIndexOutOfBoundsException if the previous line is skipped
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException thrown: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown: " + e.getMessage());
        } catch (Exception e) { // Handle any other exceptions
            System.out.println("General Exception thrown: " + e.getMessage());
        }
        System.out.println("Out of the try-catch block");
    }
}