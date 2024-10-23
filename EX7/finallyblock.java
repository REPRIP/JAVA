package EX7;

public class finallyblock {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
