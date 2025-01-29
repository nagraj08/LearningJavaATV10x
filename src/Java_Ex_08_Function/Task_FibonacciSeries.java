package Java_Ex_08_Function;

import java.util.Scanner;

public class Task_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series for fibonacci");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            printFibonacciSeries(num);
        }
        else
        {
            System.out.println("Enter a valid Integer");
            System.exit(0);

        }
    }
    public static void printFibonacciSeries(int number){
            int first=0;
            int second =1;
            for(int i=0;i<=number ;i++)
            {
                System.out.println(first +"");//print the current form
                int next= first +second;
                 //update the first and second value for next series
                first= second   ;
                second = next;

            }
    }
}
