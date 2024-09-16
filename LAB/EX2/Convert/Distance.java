package Convert;

import java.util.Scanner;

public class Distance {
    Double dist;
    int choice;
    Double metre = 0.001; //1 m to KM
    Double miles = 1.60934; //1 mile to KM
    Double Ans;

    public Distance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. metre to KM 2. miles to KM");
        System.out.println("3. KM To metre 4. KM to miles");
        System.out.println("Enter Your choice: ");
        choice = scan.nextInt();
        System.out.println("Enter Distance value : ");
        dist = scan.nextDouble();
    }

    public void convert(){
        switch(choice){
            case 1:
                Ans = dist * metre;
                System.out.println(dist + " metres in KM is" + Ans + " Km");
                break;
            case 2:
                Ans = dist * miles;
                System.out.println(dist + " miles in KM is " + Ans + "Km");
                break;
            case 3:
                Ans = dist / metre;
                System.out.println(dist + " KM in metres is " + Ans + " m");
                break;
            case 4:
                Ans = dist / miles;
                System.out.println(dist + " KM in miles is " + Ans + " miles");
                break;
            default:
                System.out.println("Enter correct Choice!");
                break;
        }
    }
}
