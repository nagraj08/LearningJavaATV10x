package Java_Ex_06_IFCondition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab_06_InterviewOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int Number!");
        int num = sc.nextInt();
        if (num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");

        }
        sc.close();
        //step Edge case

    }
}
