package EX9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class validate {
    private static String FileName = "DETAILS.txt";

    public static boolean validateCredentials(String U, String P){
        try(Scanner scan = new Scanner(new File(FileName))){
            while (scan.hasNextLine()){
                String[] credentials = scan.nextLine().split(",");
                if(credentials[0].equals(U) && credentials[1].equals(P)){
                    return true;
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("FIle not Found!");
        }
        return false;
    }

    public static void WriteContents(String[] contents){
        try (FileWriter writer = new FileWriter("output.txt")){
            for(String c : contents){
                writer.write(c + "\n");
            }
            System.out.println("Successfully Written to File!");
        }
        catch(IOException e){
            System.out.println("Error Writing to file!");
        }
    }

    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("Please provide contents to write to file!");
            return;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String Username = scan.nextLine();
        System.out.println("Enter Password: ");
        String Password = scan.nextLine();
        scan.close();

        if (validateCredentials(Username,Password)){
            WriteContents(args);
        }
        else{
            System.out.println("Invalid Username or Password!!");
        }
    }
}
