package EX10;

import java.util.*;
import java.io.*;

public class fileren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter original File name or Path: ");
        String originalFilePath = scan.nextLine();
        System.out.println("Enter name to rename: ");
        String newFilePath = scan.nextLine();

        File originalFile = new File(originalFilePath);
        File newFile = new File(newFilePath);

        if (originalFile.exists()) {
            if (originalFile.renameTo(newFile)) {
                System.out.println("File renamed successfully: " + originalFilePath + " -> " + newFilePath);
            } else {
                System.out.println("Failed to rename file: " + originalFilePath);
            }
        } else {
            System.out.println("File not found: " + originalFilePath);
        }
    }
}
