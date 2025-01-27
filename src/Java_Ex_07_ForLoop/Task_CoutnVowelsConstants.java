package Java_Ex_07_ForLoop;

import java.util.Scanner;

public class Task_CoutnVowelsConstants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = s.nextLine();
        int vowels=0;
        int constants =0;
         str = str.toLowerCase();
          for ( int i =0; i< str.length(); i++)
          {
              char ch = str.charAt(i);
              if(ch == 'a'|| ch =='e'|| ch =='i' || ch =='o' || ch =='o' || ch=='u') {
               vowels++;
              }
              else if (ch != 'a'|| ch !='e'|| ch !='i' || ch !='o' || ch!='u') {
              constants++;
              }

              }
        System.out.println("Number Vowels in the given string = "+vowels);
        System.out.println("Number Constants in the given string = "+constants);
        s.close();
          }
    }

