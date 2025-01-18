package Java_Ex_03_Literals;

import java.util.zip.GZIPInputStream;

public class Lab_02_Literals_P2 {
    public static void main(String[] args) {
        int age=65;
        int binary_num =0b1010;
        int octal_num = 0101;
        int hex_num = 0xface;
        //char c ='A';
        System.out.printf("This Age in in Value %d",age);
        System.out.println();
      //  list name = [nagraj;bitla];
       // System.out.println("name");
          char c ='A';
          short s=10;
        System.out.println("c" +s);
//        byte b1 =10;
//        int a101 = b1;// Valid - Implicit
//        int a101 = (int)b1;//Valid - Expilcit

        int a2 = 129;
       // byte b2 = a2;
        byte b2 = (byte) a2;
        System.out.println(b2);

        int course =100;
        float gst = 18.45f;
        int total_int = course+(int)gst;
        //int total_int1= course+gst;
        float total_int2= course+gst;
        float total_int3=(float)course+gst;
        System.out.println(total_int3);

    }
}
