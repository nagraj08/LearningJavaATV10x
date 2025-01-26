package Java_Ex_08_Function;

import java.util.Scanner;

public class lab_03_javafunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using predefined functions of Scanner to take input
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Takes a string input

        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // Takes an integer input

        // Print the result
        System.out.println("Hello " + name + "! You are " + age + " years old.");

        sc.close();
    }
}
