import java.util.Scanner;

public class UPConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of characters you want to input: ");
        int numCharacters = scan.nextInt();
        scan.nextLine();

        char[] characters = new char[numCharacters];

        System.out.println("Please enter " + numCharacters + " characters:");
        for (int i = 0; i < numCharacters; i++) {
            characters[i] = scan.nextLine().charAt(0);

        }
        System.out.println("\nUppercase Characters:");
        for (char c : characters) {
            System.out.print(Character.toUpperCase(c) + " ");
        }
        scan.close();
    }
}
