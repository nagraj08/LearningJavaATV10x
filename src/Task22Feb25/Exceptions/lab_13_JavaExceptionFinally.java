package Task22Feb25.Exceptions;

import java.util.Scanner;

public class lab_13_JavaExceptionFinally {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println("Start Program");
        try {
            int a= 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("closing SC!");
            sc.close();

        }


    }
}
