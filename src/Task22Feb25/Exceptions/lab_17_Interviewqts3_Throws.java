package Task22Feb25.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab_17_Interviewqts3_Throws {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("E://abc.txt");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }
    }

}
