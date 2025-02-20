package Task07Feb25;

import java.util.Scanner;

public class lab_07_InvertedRIghtAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid number");
        int num = sc.nextInt();
        for(int i=num;i>0;--i){
            for(int j =0;j<i;j++)
            {
                System.out.print('*');

            }
            System.out.println("");

        }
    }
}
