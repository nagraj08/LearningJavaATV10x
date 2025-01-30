package Task29Jan25;

import java.util.Scanner;

public class Task_01_NumPosNeg {
    public static void main(String[] args) {
        //Check given number if positive or negative
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer number only");
        if (input.hasNextInt())
        {
            int number = input.nextInt();
            String result = number > 0 ? "Positive":"Negative";
            System.out.println("Give number "+number+" is "+result);
        }
        else
        {
            System.out.println("Given number is not integer");
            System.exit(0);
        }
        input.close();
    }
}
