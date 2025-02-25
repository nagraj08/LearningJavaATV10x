package Task22Feb25.Exceptions;

import java.io.FileInputStream;

public class lab_03_CheckedException {
    public static void main(String[] args) {
        System.out.println("Start Program");
        try {
            int a =10/0;
        } catch (ArithmeticException e) {
           //throw new RuntimeException(e);
            //e.printStackTrace();
            System.out.println("cannot / by zero");
        } finally {
            System.out.println("DO nothing");
        }
        System.out.println("End Program");
        //Checked exception
        //JVM know about it , during compliation  - JVM is saying that
        // ther eis chance that required file may not be there
        // ALL the file relate dthings and SQL relate dthings are checked exception
        // ALL the null pointer and arthimatic excepti not handeled
       // FileInputStream fileInputStream = new FileInputStream("C://log.txt");

    }
}
