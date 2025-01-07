package Java_Exercises;
import  java.io.*;
import  java.util.*;

public class AddnNumbers {
    public static void main(String[] args) {
        // N is the number of elements
        int N;
        // Initialize the Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        //Taking the input of N
        N = sc.nextInt();
        int sum = 0;
        // Taking N inputs and find the sum
        for ( int i = 0;i < N; i++ ) {
           int a = sc.nextInt();
           sum +=a;
    }
        System.out.println("Sum of Input Number :"+ sum  );
}
}

