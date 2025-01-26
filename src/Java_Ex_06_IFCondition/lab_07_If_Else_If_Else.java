package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_07_If_Else_If_Else {
    public static void main(String[] args) {
        // Compare two numbers: num1 and num2
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter num1: ");
            int num1 = sc.nextInt();

            System.out.println("Enter num2: ");
            int num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("Num1 is greater: " + num1);
            } else if (num2 > num1) {
                System.out.println("Num2 is greater: " + num2);
            } else {
                System.out.println("Both numbers are equal: " + num1);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
