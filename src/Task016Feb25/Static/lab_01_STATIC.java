package Task016Feb25.Static;

import jdk.dynalink.beans.StaticClass;

public class lab_01_STATIC {
    public static void main(String[] args) {
        student1 s1 = new student1(23);
        student1 s2 = new student1(24);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(student1.CourseName);
        student1.m1();
    }
}

class student1{
    int age;//Non Static
    static String CourseName = "ATB";

//    void student1 () {
//        student1(0);
//    }

    public student1 (int Userage){
         this.age= Userage;
     }
     static void m1 (){
         System.out.println(" I am a static method ");
     }
}