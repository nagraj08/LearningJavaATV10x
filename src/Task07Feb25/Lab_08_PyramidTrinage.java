package Task07Feb25;

import java.util.Scanner;

public class Lab_08_PyramidTrinage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid input");
        int num = sc.nextInt();
         for(int i=1;i<=num;i++){
             for (int j=num;j>i;j--)
                 {
                     System.out.print(" ");
                 }
                 for(int k = 1;k<= (2*i-1);k++ )
                     {
                         System.out.print("*");
                     }
             System.out.println();
             }

         }
    }

