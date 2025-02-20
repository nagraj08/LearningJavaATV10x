package Task016Feb25.SuperKeyword;

import Task015Feb25.Cars;

import javax.xml.transform.Source;

public class lab_02_AbstractClass {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();


    }
}
class Vehicle{
    public  int maxSpeed = 180;
    void notest(){

    }
    Vehicle (){
        System.out.println("Default Constructor");
    }
    Vehicle (int a){
        System.out.println("Param Constructor");

    }
    //Method Overloading same function name with different arguments
    void message(){
        System.out.println("No Return, No arguments");
    }
    void message(int a){
        System.out.println("PC - Param Constructor");
    }
    void display(){
        System.out.println("Vehicle Parent");
    }


}
//Single Inheritance
class car extends Vehicle{
    private int maxSpeed = 280;
    void test(){};
    car(){
        super(100);
    }
    car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("Overide - Car");
        System.out.println(super.maxSpeed);//180 Parent max speed
        System.out.println(this.maxSpeed);//280 subclass max speed
        super.notest();
        this.test();
    }
}