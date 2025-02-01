package Task01Feb25;

import java.util.Scanner;

public class lab_01_divisibleby5or11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter a valid integer");
            sc.close();
            return;
        }
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 11==0)
        {
            System.out.println("Given number is divisble by 5 and 11");
        }
        else {
            System.out.println("Not divisible");
        }
        sc.close();
    }
}
