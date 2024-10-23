package EX6;

import java.util.LinkedList;
import java.util.Scanner;

public class LList {
    public static void main(String[] args){
        LinkedList<String> llist = new LinkedList<String>();
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert: ");
                    String element = scan.next();
                    llist.add(element);
                    break;
                case 2:
                    System.out.println("Enter the element to delete: ");
                    element = scan.next();
                    llist.remove(element);
                    break;
                case 3:
                    System.out.println("Linked List: " + llist);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
