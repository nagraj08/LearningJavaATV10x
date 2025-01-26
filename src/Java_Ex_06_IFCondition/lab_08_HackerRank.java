package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_08_HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your Score (0 - 100): ");

            // Validate that input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a whole number between 0 and 100.");
                return; // Exit program gracefully
            }

            int score = sc.nextInt();

            // Validate score is within 0-100
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! The score must be between 0 and 100.");
                return; // Exit program gracefully
            }

            // Determine the grade
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F'; // Anything below 60 gets F
            }

            // Output the grade
            System.out.println("Your Grade is: " + grade);

        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            sc.close(); // Ensure scanner is closed
        }
    }
}
