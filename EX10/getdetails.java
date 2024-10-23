package EX10;

import java.util.*;
import java.io.*;

public class getdetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File name or Path: ");
        String FPath = scan.nextLine();

        try {
            File file = new File(FPath);

            if (file.exists()) {
                long lastModified = file.lastModified();
                Date date = new Date(lastModified);
                System.out.println("Last modified Date & Time: " + date);

            } else {
                throw new FileNotFoundException("File not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
