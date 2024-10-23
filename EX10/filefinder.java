package EX10;

import java.io.*;
import java.util.Scanner;

public class filefinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File name or Path: ");
        String FPath = scan.nextLine();

        try {
            File file = new File(FPath);

            if (file.exists()) {
                System.out.println("File found");
            } else {
                throw new FileNotFoundException("File not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
