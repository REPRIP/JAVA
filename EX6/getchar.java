package EX6;

import java.util.Scanner;

public class getchar{
    public static void main(String[] args){
        String str;
        int in;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String");
        str = scan.nextLine();

        System.out.println("Enter the index of the character: ");
        in = scan.nextInt();

        if (in < 0 || in >= str.length()){
            System.out.println("Index Out of Bounds");
        }
        else{
            char c = str.charAt(in);
            System.out.println("Character at Index " + in + " is " + c);
        }
        scan.close();
    }
}
