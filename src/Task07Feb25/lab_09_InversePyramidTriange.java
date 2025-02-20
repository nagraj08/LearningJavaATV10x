package Task07Feb25;

import java.util.Scanner;

public class lab_09_InversePyramidTriange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid number");
        int num = sc.nextInt();
        for(int i=num;i>=1;i--){
            for (int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k< (2*i-1);k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i=1;i<=num;i++){
//            for(int k = num;k> 0;k-- )
//            {
//                System.out.print("*");
//            }for (int j=1;j>i;j++)
//
//            {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
    }
}
