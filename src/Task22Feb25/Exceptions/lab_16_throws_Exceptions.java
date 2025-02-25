package Task22Feb25.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab_16_throws_Exceptions {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        File file = null;
        try {
            file = new File("E://abc.txt");
            FileInputStream F = new FileInputStream(file);
        }
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

    }
}

