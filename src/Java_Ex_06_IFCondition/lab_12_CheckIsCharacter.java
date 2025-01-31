package Java_Ex_06_IFCondition;

import java.util.Scanner;

public class lab_12_CheckIsCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        if(!sc.hasNext()) {
            System.out.println("Enter valid Alphabet");
            sc.close();
            return;

        }
                char ch = sc.next().charAt(0); // Example character

                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is an alphabet.");
                } else {
                    System.out.println(ch + " is NOT an alphabet.");
                }
                sc.close();
            }
        }


