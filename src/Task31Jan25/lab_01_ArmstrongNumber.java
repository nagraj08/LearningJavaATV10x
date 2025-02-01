package Task31Jan25;

import java.util.Scanner;

public class lab_01_ArmstrongNumber {
    public static void main(String[] args) {
        //Armstrong Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Valid integer number");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Number");
            sc.close();
            return;

        }
        int n = sc.nextInt();
        if (IsArmstrong(n)) {
            System.out.println(n + " is a Armstrong Number");
        } else {
            System.out.println(n + " is not a Armstrong Number");
        }
        sc.close();
    }
    public static boolean IsArmstrong(int number){
        if(number<0)
        {
            return false;

        }
        int sum = 0;
        int original = number;
        int digits = String.valueOf(number).length();
        while (number>0)
        {
            int digit = number%10;
            sum+=Math.pow(digit,digits);
            number/=10;
        }

        return  sum == original;
    }

}
