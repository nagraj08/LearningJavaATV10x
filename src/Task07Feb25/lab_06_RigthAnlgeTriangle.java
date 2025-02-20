package Task07Feb25;

import java.util.Scanner;

public class lab_06_RigthAnlgeTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter valid input");
        int num = sc.nextInt();
        for (int i =0;i<=num;i++){
            for(int j =0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
