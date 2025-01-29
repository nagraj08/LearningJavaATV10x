package Java_Ex_08_Function;

public class lab_05_userdefninonefunc {
    public static void main(String[] args) {
            //with para and with return type
        greet();
        //String s = greet_with_hello();
        System.out.println(greet_with_hello());
        System.out.println("Age to vote is ->"+age_to_vote());
        greet_with_name("nagraj","Bitla");
        greet_with_details("Nagraj",46, 50000);
        System.out.println("Sum of two numbers 3 and 4 is "+sum_of_two(3,4));
        System.out.println("Sum of three numbers 3, 4 and 5 is "+sum_of_three(3,4,5));

    }
    static void greet() {
        System.out.println("Hi I am without para and without return type");
    }
    static String greet_with_hello() {
        return ("Hi how are you");
    }
    static int age_to_vote() {
        return 18;
    }
    static void greet_with_name(String name, String lname) {
        System.out.println("Hi, Your name is " +name+" "+ lname);
    }
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Hi, Your name is " +name+", Your age is "+ age+" your salary is "+salary);
    }
    static int sum_of_two(int num1, int num2) {
        return  num1+num2;
    }
    static int sum_of_three(int num1, int num2, int num3) {
        return  num1+num2+num3;
    }
}

