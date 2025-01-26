package Java_Ex_08_Function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab_06_funcInterviewQts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int num1 = sc.nextInt();
        System.out.println("Enter second numbers");
        int num2 = sc.nextInt();
        System.out.println("Sum ob two number"+Sum(num1,num2));
        System.out.println("Sub ob two number"+Sub(num1,num2));
        System.out.println("Div ob two number"+Div(num1,num2));
        System.out.println("Mul ob two number"+Mul(num1,num2));
        System.out.println("Mod ob two number"+Mod(num1,num2));

// fun of sub , sum, Mul and Div
    }
    static int Sum(int a, int b)
    {
        return a+b;
    }
    static int Sub(int a, int b)
    {
        return a-b;
    }
    static int Mul(int a, int b)
    {
        return a*b;
    }
    static int Div(int a, int b)
    {
        return a/b;
    }
    static int Mod(int a, int b)
    {
        return a%b;
    }
}
