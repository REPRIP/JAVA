package EX10;

import java.io.*;
import java.util.*;

public class checkread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File name or Path: ");
        String FPath = scan.nextLine();

        try {
            File file = new File(FPath);

            if (file.exists()) {
                if (file.canRead()){
                    System.out.println("File can be read");
                } else {
                    System.out.println("File cannot be read");
                }
            } else {
                throw new FileNotFoundException("File not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
