// packeagein the place where your java code resides
package Java_Exercises_02;
//import statement
 import java.util.Scanner;
public class FlowOfJavaProgram {

    // define the main class
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        //Taking the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your Name");
        String name = scanner.nextLine();
        //output greetings
        System.out.println("Hello"+name+"!");

    }
}
