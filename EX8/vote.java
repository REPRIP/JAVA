package EX8;

import java.util.Scanner;

public class vote {
    public static void main(String[] args){
        String DOB;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter DOB in the format DD/MM/YYYY");
        DOB = scan.nextLine();
        try{
            int year = Integer.parseInt(DOB.substring(6, 10));
            int age = 2024 - year;
            if (age < 18){
                throw new checkAge("You are not eligible to vote. You must be at least 18 years old.");
            }
            else{
                System.out.println("You are eligible to Vote!");
            }
            
        }
        catch (checkAge e){
            System.out.println(e.getMessage());
        }
        
    }
}
