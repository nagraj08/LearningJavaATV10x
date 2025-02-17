package Task09Feb25;

import java.util.Arrays;
import java.util.Scanner;

public class lab_09_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0]=90;
        a[1]=91;
        a[2]=92;

//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
            for(int i : a)
            {
                System.out.println(i);
            }
            int c = 5;
            String [] names = new String[c];
            Scanner sc = new Scanner(System.in);

            for (int i =0; i<names.length;i++)
            {
                System.out.println("Enter the Names" );
                names[i] = sc.next();
            }
            for (String s : names)
            {
                System.out.println(s);
              //  s = sc.next();
            }
sc.close();

    }
}
