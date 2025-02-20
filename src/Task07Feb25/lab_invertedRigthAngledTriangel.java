package Task07Feb25;

import java.util.Scanner;

public class lab_invertedRigthAngledTriangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid Number");
            sc.close();
            return;

        }
        int n= sc.nextInt();
        for(int r=n;r>0;r--){
            for(int c=r;c>0;c--){
                System.out.print("*");

            }
            System.out.println("");
        }
        sc.close();

    }
}
