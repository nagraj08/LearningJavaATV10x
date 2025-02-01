package Task01Feb25;

import java.util.Scanner;

public class lab_04_agegroupdetecter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for age input
        System.out.println("Enter your age:");

        // Validate if the input is an integer
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid age as a number.");
            return; // Exit the program gracefully
        }

        int age = sc.nextInt();

        // Validate the age is non-negative
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        } else if (age <= 12) {
            System.out.println("You are a Child.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age <= 64) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Senior Citizen.");
        }

        // Close the scanner
        sc.close();
    }
}
