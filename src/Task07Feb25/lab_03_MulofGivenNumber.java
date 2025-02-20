package Task07Feb25;

import java.util.Scanner;

public class lab_03_MulofGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table");
        if (!sc.hasNextInt())
        {
            System.out.println("Enter valid number");
            sc.close();
            return;
        }

        int input=sc.nextInt();
        for (int i=0;i<=input;i++)
        {
            System.out.println(input+" * "+i+" = "+input*i);

        }
        sc.close();
    }
}
