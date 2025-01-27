package Java_Ex_07_ForLoop;

import java.util.Scanner;

public class Task_Palindrom {
    public static void main(String[] args) {
        //Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        String reverse ="";
        String Ispalindrom ="";
        str = str.toLowerCase();
        for (int i = str.length()-1;i>-1;i--)
        {
            reverse =String.valueOf(str.charAt(i));
            Ispalindrom = Ispalindrom+reverse;

        }
        if (str.equals(Ispalindrom))
        {
        System.out.println("Give string "+str+ " is a palindrome as reverse is" +Ispalindrom);
        }
        else
        {
            System.out.println("Give string "+str+ " is not a palindrome as reverse is" +Ispalindrom);

        }



    }
}
