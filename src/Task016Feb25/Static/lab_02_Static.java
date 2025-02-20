package Task016Feb25.Static;

import java.sql.SQLOutput;

public class lab_02_Static {
    public static void main(String[] args) {
        ATB s1= new ATB(123,"Nagraj");
        ATB s2 = new ATB(456,"Bitla");
        System.out.println(s1.phoneNp);
        System.out.println(s2.name);
        System.out.println(ATB.coursename);;
        ATB.m1();

    }
}

class ATB{
    static String coursename="ATB";
    int phoneNp;
    String name;

    public ATB(int phoneNp_c,String name_C){
        this.phoneNp = phoneNp_c;
        this.name=name_C;
    }
    void display(){
        System.out.println(this.phoneNp+"--"+this.name+"--"+coursename);
    }
static void m1(){
    System.out.println("Mark Attendance");
}
}