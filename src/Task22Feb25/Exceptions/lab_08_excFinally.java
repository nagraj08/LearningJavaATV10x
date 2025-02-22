package Task22Feb25.Exceptions;

import java.util.Scanner;

public class lab_08_excFinally {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closing SC!");
        }
    }
}
