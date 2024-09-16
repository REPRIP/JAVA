package Convert;

import java.util.Scanner;

public class Time {
    Double time;
    Double hour;
    Double min;
    Double seconds;
    int choice;

    public Time(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Hour to minutes 2. Hour to seconds");
        System.out.println("3. minutes to hour/minutes  4. seconds to hour/minutes/seconds");
        System.out.println("Enter Your choice: ");
        choice = scan.nextInt();
        System.out.println("Enter value of Time: ");
        time = scan.nextDouble();
    }

    public void convert(){
        switch (choice){
            case 1:
                hour = time;
                min = hour * 60;
                System.out.println(hour + "hours is " + min + " minutes");
                break;
            case 2:
                hour = time;
                seconds = hour * 3600;
                System.out.println(hour + " hours is " + seconds + " seconds");
                break;
            case 3:
                min = time;
                hour = min / 60;
                seconds = min * 60;
                System.out.println(min + " minutes is " + hour.intValue() + " hours and " + (min % 60) + " minutes");
                break;
            case 4:
                seconds = time;
                min = seconds / 60;
                hour = min / 60;
                min = min % 60;
                System.out.println(seconds + " seconds is " + hour.intValue() + " hours, " + min.intValue() + " minutes, and " + (seconds % 60) + " seconds");
                break;
            default:
                System.out.println("Enter correct Choice!");
                break;
        }
    }
}
