import Convert.*;
import java.util.Scanner;

public class Main {
    static int ch;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1. Currency Converter 2. Distance Converter 3. Time converter 4. Exit");
            System.out.println("Enter your choice: ");
            ch = scan.nextInt();
            if(ch == 1){
                Currency C = new Currency();
                C.convert();  
            }
            else if(ch == 2){
                Distance D = new Distance();
                D.convert();
            }
            else if(ch == 3){
                Time T = new Time();
                T.convert();
            }
        } while (ch != 4);
        scan.close();
    }
}
