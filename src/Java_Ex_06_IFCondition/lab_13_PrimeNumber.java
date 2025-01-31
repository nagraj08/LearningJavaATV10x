package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_13_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid integer");
        if (!sc.hasNextInt()) {
            System.out.println("Enter valid number");
            sc.close();
            return;
        }
        int num = sc.nextInt();
        if (IsPrim(num)) {
            System.out.println(num + " is a prime number");

        } else {
            System.out.println(num + " not a prime number");
        }
        sc.close();
    }

    public static boolean IsPrim(int n) {
        if (n <= 1) {
            return false;

        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

