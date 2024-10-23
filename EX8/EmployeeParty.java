package EX8;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeParty {
    private ArrayList<Integer> hall1Ages;
    private ArrayList<Integer> hall2Ages;
    private ArrayList<Integer> hall3Ages;

    public EmployeeParty() {
        this.hall1Ages = new ArrayList<>();
        this.hall2Ages = new ArrayList<>();
        this.hall3Ages = new ArrayList<>();
    }

    public void assignHall(int empId, int age) {
        try {
            if (empId % 2 == 0 && age < 30) {
                hall1Ages.add(age);
                System.out.println("Welcome to the party in hall 1");
                throw new Hall1Exception("You are not allowed in hall 2 or hall 3");
            } else if (empId % 2 != 0 && age > 30) {
                hall2Ages.add(age);
                System.out.println("Welcome to the party in hall 2");
                throw new Hall2Exception("You are not allowed in hall 1 or hall 3");
            } else {
                hall3Ages.add(age);
                System.out.println("Welcome to the party in hall 3");
            }
        } catch (Hall1Exception e) {
            System.out.println(e.getMessage());
        } catch (Hall2Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void calculateAverageAge() {
        calculateAndPrintAverageAge(hall1Ages, "hall 1");
        calculateAndPrintAverageAge(hall2Ages, "hall 2");
        calculateAndPrintAverageAge(hall3Ages, "hall 3");
    }

    private void calculateAndPrintAverageAge(ArrayList<Integer> ages, String hallName) {
        if (!ages.isEmpty()) {
            double averageAge = calculateAverage(ages);
            System.out.println("Average age in " + hallName + ": " + averageAge);
        } else {
            System.out.println("Cannot calculate average age for empty list in " + hallName);
        }
    }

    private double calculateAverage(ArrayList<Integer> ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.size();
    }

    public static void main(String[] args) {
        EmployeeParty party = new EmployeeParty();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter employee id for employee " + (i + 1) + ": ");
            int employeeId = scanner.nextInt();
            System.out.print("Enter age for employee " + (i + 1) + ": ");
            int age = scanner.nextInt();
            party.assignHall(employeeId, age);
        }
        party.calculateAverageAge();
        scanner.close();
    }
}