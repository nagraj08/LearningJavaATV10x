package Java_Ex_04_TernaryOperator;

import java.util.Scanner;

public class lab_06_smallerofthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 in integer value only");
        if(!input.hasNextInt())
        {
            System.out.println("Invalid number entered");
            input.close();
            return;
        }
        int num1 = input.nextInt();

        System.out.println("Enter number 2 in integer value only");
        if(!input.hasNextInt())
        {
            System.out.println("Invalid number entered");
            input.close();
            return;
        }
        int num2 = input.nextInt();
        System.out.println("Enter number 3 in integer value only");
        if(!input.hasNextInt())
        {
            System.out.println("Invalid number entered");
            return;
        }
        int num3 = input.nextInt();
        int result = num1 < num2? Math.min(num1,num3):Math.min(num2,num3);
        System.out.println("Smaller number is "+result);
        input.close();

    }
}
