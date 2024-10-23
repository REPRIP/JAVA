package EX7;

import java.util.Scanner;

public class vote {

    public static void checkVotingAge(int age) throws IllegalArgumentException {
        if (age < 18){
            throw new IllegalArgumentException("Age must be above 18 to vote!");
        }
        else{
            System.out.println("You are eligible to vote!");
        }
    }
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            checkVotingAge(age);
            scan.close();
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
