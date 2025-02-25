package Task22Feb25.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab_21_ThrowException {
    static void validate_Age(int age) {

        if (age < 18) {

        try {
            throw new RuntimeException("age cannot be less than 18");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    }

    public static void main(String[] args) throws FileNotFoundException {
        validate_Age(19);
        FileInputStream fileInputStream = new FileInputStream("E://abc.txt");

    }
}