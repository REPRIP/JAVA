package EX9;

import java.io.*;
import java.util.Scanner;

public class marks {
    public static void categorizeStudents(){
        try(Scanner scan = new Scanner(new File("studentMarks.txt"))){
            File bestPerformersFile = new File("best_performers.txt");
            File lowPerformersFile = new File("low_performers.txt");

            try(FileWriter bestWriter = new FileWriter(bestPerformersFile);FileWriter LowWriter = new FileWriter(lowPerformersFile)){
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    String[] sp = line.split(",");
                    if (sp.length == 2){
                        String name = sp[0];
                        int mark = Integer.parseInt(sp[1]);

                        if(mark > 90){
                            bestWriter.write(name + "\n");
                        } else if (mark < 40) {
                            LowWriter.write(name + "\n");
                        }
                    }
                }
            }
            catch(IOException e){
                System.out.println("Error writing to best or low performers file: " + e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println("Error reading main file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        categorizeStudents();
    }
}
