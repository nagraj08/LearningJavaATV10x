package Task29Jan25;

import Java_Ex_06_IFCondition.Lab_02IfConditionElse;

import java.util.Scanner;

public class Task_02_EvenOdd {
    public static void main(String[] args) {
        //Check if the given number is Even or Odd
        Scanner input = new Scanner((System.in));
        System.out.println("Enter the number to check Odd Even");
        if(input.hasNextInt())
        {
            int num = input.nextInt();
            String result = num % 2==0?"Even":"Odd";
            System.out.println("Given number "+num+" is " +result);
        }
        else
        {
            System.out.println("Integer is not entered please fix");
            System.exit(0);

        }
        input.close();
    }
}
