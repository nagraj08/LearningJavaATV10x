package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_14_ATM {
    public static void main(String[] args) {
        double balance = 10000.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        if(!input.hasNextInt())
        {
            System.out.println("Please enter valid amount to withdraw in 100s");
            input.close();
            return;
        }
        double wd = input.nextDouble();
        if(wd>balance)
        {
            System.out.println("Cannot withdraw mor ethan the available balance "+balance);
            input.close();
            return;
        }
        else if (wd%100 !=0)
        {
            System.out.println("Please enter withdrawal amount in 100s only");
            input.close();
            return;
        }
        else if(wd<=0)
        {
            System.out.println("Enter the amount to withdraw");
        }
        else
        {
            System.out.println(balance-wd+" is the balance after withdrawal of amount "+wd);
        }
        input.close();
    }
}
