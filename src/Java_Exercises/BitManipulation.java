package Java_Exercises;

//public class BitManipulation {
//}
// Java Program to implement
// Bit Manipulation to Find
// the Sum of two Numbers
import java.io.*;

// Driver Class
class BitManipulation {
    // function to find sum
    public static int sum(int num1, int num2)
    {
        if (num2 == 0) return num1;
        return sum(num1 ^ num2, (num1 & num2) << 1);

    }

    // main function
    public static void main(String[] args)
    {
        BitManipulation ob = new BitManipulation();
        int res = ob.sum(28, 0);
        System.out.println(res);
    }
}
