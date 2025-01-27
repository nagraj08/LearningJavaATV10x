package Java_Ex_07_ForLoop;

import java.util.Scanner;

public class rehersal {
    public static void main(String[] args) {
        //Reverse of a number
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int reverse = 0;
        System.out.println("Enter a integer number that need to be reverse");
        if(sc.hasNextInt()){
            num= sc.nextInt();
        } else
        {
            System.out.println("Number should be integer");
            System.exit(0);
        }
        for (int orinum=num;orinum!=0;orinum /=10)
        {
            int digit = orinum %10;
            reverse = reverse *10 + digit;
        }
        System.out.println("Original Number is " + num);
        System.out.println("Reverse Number is " + reverse);
        sc.close();

    }
}
