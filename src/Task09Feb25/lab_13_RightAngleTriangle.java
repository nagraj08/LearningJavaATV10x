package Task09Feb25;

import java.util.Scanner;

public class lab_13_RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        if(!sc.hasNextInt()){
            System.out.println("Enter valid Length");
            sc.close();
            return;
        }
        int num = sc.nextInt();
        for (int i =0; i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
