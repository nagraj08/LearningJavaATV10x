package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_10_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        try {
            System.out.println("Enter the day number (1 to 7): ");

            // Check if the input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer between 1 and 7.");
                return; // Exit program gracefully
            }

            int day = sc.nextInt();

            // Switch case for day number
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close scanner
        }
    }
}
