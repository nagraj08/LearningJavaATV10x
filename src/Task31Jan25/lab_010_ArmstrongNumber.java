package Task31Jan25;

import java.util.Scanner;

public class lab_010_ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false; // Negative numbers are not Armstrong numbers
        }

        int original = number;
        int sum = 0;
        int digits = String.valueOf(original).length();

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit,digits);//Math.pow(digit, digits); // Add digit^digits to sum
            number /= 10; // Remove the last digit
        }

        return sum == original;
    }
}
