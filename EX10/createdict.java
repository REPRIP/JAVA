package EX10;

import java.io.*;
import java.util.*;

public class createdict {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Directory name or Path: ");
        String DPath = scan.nextLine();

        File directory = new File(DPath);

        if (directory.exists()) {
            System.out.println("Directory already exists");
        } else {
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully: ");
            } else {
                System.out.println("Failed to create directory: ");
            }
        }
    }
}
