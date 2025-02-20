package Task07Feb25;

import java.util.Scanner;

public class lab_05_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(Isprime(num)){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime");
        }

    }
    public static boolean Isprime(int n){
        if(n<=1){
        return false;}
        if(n==2){
            return true;
        }
        if(n%2==0){
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
