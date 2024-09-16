package Convert;

import java.util.Scanner;

public class Currency {
    Double Curr;
    int choice;
    Double Dollar = 83.71; //1 dollar in terms of INR
    Double Euro = 90.78;
    Double Yen = 0.54;
    Double Ans;

    public Currency(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Dollar to INR 2. EURO to INR 3. Yen to INR");
        System.out.println("4. INR to Dollar 5. INR to Euro 6. INR to Yen");
        System.out.println("Enter Your choice: ");
        choice = scan.nextInt();
        System.out.println("Enter Currency: ");
        Curr = scan.nextDouble();
    }

    public void convert(){
        switch(choice){
            case 1:
                Ans = Curr * Dollar;
                System.out.println(Curr + " Dollars in INR is Rs. " + Ans);
                break;
            case 2:
                Ans = Curr * Euro;
                System.out.println(Curr + " EURO in INR is Rs. " + Ans);
                break;
            case 3:
                Ans = Curr * Yen;
                System.out.println(Curr + " Yen in INR is Rs. " + Ans);
                break;
            case 4:
                Ans = Curr / Dollar;
                System.out.println(Curr + " INR in Dollars is " + Ans);
                break;
            case 5:
                Ans = Curr / Euro;
                System.out.println(Curr + " INR in  Euro is " + Ans);
                break;
            case 6:
                Ans = Curr / Yen;
                System.out.println(Curr + " INR in Yen is " + Ans);
                break;
            default:
                System.out.println("Enter correct Choice!");
                break;
        }
    }
}
