package Java_Ex_07_ForLoop;

import java.util.Scanner;

public class Task_FizzBizz {
    public static void main(String[] args) {
//        FizzBuzz Test:
//
//        Write a program that prints numbers from 1 to 100. However,
//        for multiples of 3, print "Fizz" instead of the number,
//        and for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5, print "FizzBuzz."
//        (for loop, if else)

        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.println(" This number "+i+" is  Fizz");
            }
            else if (i%5==0)
                {
                    System.out.println(" This number "+i+" is Fizz");
                }
                else if (i%3==0 && i%5==0)
                {
                    System.out.println(" This number "+i+" is FizzBuzz");
                }
                else
            {
                System.out.println(" This number  "+i+" is not Fizz or Buzz");
            }

            }
        }
    }

