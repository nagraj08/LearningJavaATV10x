package Task09Feb25;

import java.util.Arrays;

public class lab_01_Array {
    public static void main(String[] args) {
        //What is an Array - it is block of memory location that store similar data types
        //eg - Marks of Student, Name sof Student
        // Array store a hetrogenous data
        int [] marks1 = {90,100,10,92,83,87};// 1st type know as pre-define
        //
        int [] marks2 = new int[5];//this is 2nd type was to make array and it will have fix size
        System.out.println(marks1.length);
        System.out.println(marks1[0]);

        String s1 = "nagraj";
        System.out.println(s1.length());
        String [] names = {"a","b"};//Srting array
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        String [] names2 = new String[3];
        names2[0]="AAA";
        names2[1]="BBB";
        names2[2]="CCC";
        System.out.println(names2[2]);
    }
}
