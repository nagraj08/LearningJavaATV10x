package Java_Ex_07_ForLoop;

import java.util.Scanner;

public class Task_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find factorial of it");
        int number = input.nextInt();
        int result = 1;
        if ( number!=0)
        {
            for (int i=1;i<=number;i++)
            {
                result = result * i;
            }
            System.out.println(" Factorial is "+result);

        }
        else
        {
            System.out.println("Cannot find factorial of number 0");
            System.exit(0);
        }
        input.close();


    }
}
