package Task31Jan25;

import java.util.Scanner;

public class lab_07_VisaForTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and validate age
        System.out.print("Enter your age: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid age input. Please enter a non-negative integer.");
            scanner.close();
            return;
        }

        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (age < 0) {
            System.out.println("Age cannot be negative.");
            scanner.close();
            return;
        }

        // Read and validate visa status
        System.out.print("Enter visa status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();
        boolean isVisaValid = visaStatus.equals("valid");

        // Check eligibility
        if (age >= 18 && isVisaValid) {
            System.out.println("You are eligible to travel.");
        } else {
            System.out.println("You cannot travel. Eligibility criteria not met.");
        }

        scanner.close();
    }
}
