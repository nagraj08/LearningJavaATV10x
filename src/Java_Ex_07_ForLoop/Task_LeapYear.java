package Java_Ex_07_ForLoop;

import java.util.Scanner;

public class Task_LeapYear {
    public static void main(String[] args) {
        //1. Leap year.  2024, 2025
        Scanner inputyear = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter the year only in int");
        if(inputyear.hasNextInt()){
            number = inputyear.nextInt();
        } else {
            System.out.println("Enter year only in  Int");
            System.exit(0);
        }
        if(number % 4==0)
        {
            System.out.println("Given year "+number+ " is a leap year");
        }
        else
        {
            System.out.println("Given year "+number+ " is not a leap year");

        }
        inputyear.close();
    }
}
