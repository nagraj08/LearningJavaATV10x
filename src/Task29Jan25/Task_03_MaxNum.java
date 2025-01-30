package Task29Jan25;

import java.util.Scanner;

public class Task_03_MaxNum {
    public static void main(String[] args) {
        //Check max number of two
        int num1 =0;
        int num2 =0;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Num1");
        if(input1.hasNextInt()) {
            num1 = input1.nextInt();
        }
        else
        {
            System.out.println("Entered Number is not integer");
            System.exit(0);
        }
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Num2");
        if(input2.hasNextInt()) {
            num2 = input2.nextInt();
        }
        else
        {
            System.out.println("Entered Number is not integer");
            System.exit(0);
        }
        int result = Math.max(num1, num2);
        System.out.println(" Number "+result+ " is greater between "+num1+" and "+num2);
        input1.close();
        input2.close();
    }
}
