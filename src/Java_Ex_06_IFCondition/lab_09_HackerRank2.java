package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_09_HackerRank2 {
    public static void main(String[] args) {
        // Triangle Classifier
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Side 1 of the triangle:");
            double side1 = sc.nextDouble();

            System.out.println("Enter Side 2 of the triangle:");
            double side2 = sc.nextDouble();

            System.out.println("Enter Side 3 of the triangle:");
            double side3 = sc.nextDouble();

            // Validate that the sides are greater than 0
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("Invalid input! All sides of a triangle must be positive numbers.");
                return; // Exit the program gracefully
            }

            // Check if the sides form a valid triangle using the Triangle Inequality Theorem
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                System.out.println("The given sides do not form a valid triangle.");
                return; // Exit since it's not a triangle
            }

            // Classify the triangle based on the sides
            if (side1 == side2 && side2 == side3) {
                System.out.println("It is an equilateral triangle.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("It is an isosceles triangle.");
            } else {
                System.out.println("It is a scalene triangle.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid numeric values for the sides.");
        } finally {
            sc.close(); // Ensure the scanner is closed
        }
    }
}
