package Task01Feb25;

import java.util.Scanner;

public class lab_02_YearsCOnverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of days
        System.out.println("Enter the number of days:");
        int totalDays = sc.nextInt();

        // Validate input
        if (totalDays < 0) {
            System.out.println("Please enter a valid positive number of days.");
        } else {
            // Convert days into years, months, and remaining days
            int years = totalDays / 365;             // Calculate number of years
            int remainingDays = totalDays % 365;     // Days left after counting years
            int months = remainingDays / 30;         // Calculate number of months
            int days = remainingDays % 30;           // Remaining days after counting months

            // Print the result
            System.out.println(totalDays + " days is approximately: " + years + " years, " + months + " months, and " + days + " days.");
        }

        // Close the scanner
        sc.close();
    }
}
