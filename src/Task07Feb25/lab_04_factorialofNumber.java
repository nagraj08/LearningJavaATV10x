package Task07Feb25;

import java.util.Scanner;

public class lab_04_factorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid integer");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid number");
            sc.close();
            return;
        }
        int num = sc.nextInt();
        int res = 1;
        for(int i=0;i<=num;i++)
        {
            if(i!=0){
                res=res*i;
            }



        }
        System.out.println("factorial of a given number is"+res);
    }
}
