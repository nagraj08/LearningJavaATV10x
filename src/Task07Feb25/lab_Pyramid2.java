package Task07Feb25;

import java.util.Scanner;

public class lab_Pyramid2 {
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
        for(int r=1;r<=n;r++){
            for(int c= n;c>r;c--){
                System.out.print(" ");

            }
            for(int k= 1;k<=(2*r-1);k++){
                System.out.print("*");

            }
            System.out.println();
        }
        sc.close();

    }
}
