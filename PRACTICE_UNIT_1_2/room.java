import java.util.Scanner;

public class room {
    //Question 4
    int roomno;
    String roomtype;
    int roomarea;
    boolean ACmachine;

    public void setdata(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter roomno: ");
        roomno = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the roomtype: ");
        roomtype = scan.nextLine();
        System.out.println("Enter the roomarea: ");
        roomarea = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter whether AC is present (true or false):");
        ACmachine = scan.nextBoolean();
        scan.close();
    }

    public void displaydata(){
        System.out.println();
        System.out.println("Room Number is: " + roomno);
        System.out.println("Room type is: " + roomtype);
        System.out.println("Roomarea is: " + roomarea);
        System.out.println("Is AC present: " + ACmachine);
    }

    public static void main(String[] args) {
        room R1 = new room();
        R1.setdata();
        R1.displaydata();
    }
}
