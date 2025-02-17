package Task09Feb25;

import java.util.Scanner;

public class lab_07_Array_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size fo array in Integer Only");
        int size = sc.nextInt();
        String [] names = new String[size];
        for( int i =0;i< names.length;i++ )
        {
            System.out.println("Enter the Names");
            names[i] = sc.next();

        }
        System.out.println("---------------");
        for (int i =0; i< names.length;i++)
        {
            System.out.println(names[i]);
        }
    }

}
