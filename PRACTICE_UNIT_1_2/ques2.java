public class ques2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.err.println("Postfix Increment" + (a++));
        System.err.println("Prefix Increment" + (++a));
        System.err.println("Postfix Decrement" + (b--));
        System.err.println("Prefix Decrement" + (--b));
        System.err.println("Bitwise Complement Operator" + ~a);

        System.out.println("\nArithmetic Operators:");
        int x = 10;
        int y = 3;
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));

        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        System.out.println("\nBitwise Operators:");
        int c = 5; 
        int d = 3; 
        System.out.println("Bitwise AND: " + (c & d)); 
        System.out.println("Bitwise OR: " + (c | d)); 
        System.out.println("Bitwise XOR: " + (c ^ d)); 
        System.out.println("Bitwise Left Shift: " + (c << 1));
        System.out.println("Bitwise Right Shift: " + (c >> 1));

        System.out.println("\nConditional Operator:");
        int e = 10;
        int f = 3;
        int max = (e > f) ? e : f;
        System.out.println("Maximum value: " + max);
    }
    
}
