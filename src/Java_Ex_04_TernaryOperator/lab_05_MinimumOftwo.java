package Java_Ex_04_TernaryOperator;

import javax.xml.transform.Source;
import java.util.Scanner;

public class lab_05_MinimumOftwo {
    public static void main(String[] args) {
        //FInd minimum of two number
        Scanner input1= new Scanner(System.in);
        System.out.println("Enter integer number1 only");
        if(!input1.hasNextInt())
        {
            System.out.println("Invalid number entered");
            return;
        }
        Scanner input2= new Scanner(System.in);
        System.out.println("Enter integer number2 only");
        if(!input2.hasNextInt())
        {
            System.out.println("Invalid number entered");
            return;
        }
        int result = Math.min(input1.nextInt(),input2.nextInt());
        System.out.println("Smaller number is "+result);
        input1.close();
        input2.close();
    }
}
