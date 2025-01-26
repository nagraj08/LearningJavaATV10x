package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class Lab_02IfConditionElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int age =Integer.parseInt(args[0]);
        //if (age ="") {
            System.out.println("Enter your age");
            int age = sc.nextInt();
        //}
        if ( age > 18)
        {
            System.out.println("You can vote!");
        }
        else
        {
            System.out.println("You canot vote!");

        }
    }
}
