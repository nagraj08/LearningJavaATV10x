package Task015Feb25;

import javax.xml.transform.Source;
import java.util.Scanner;

public class lab08_Cars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<2;i++){
            System.out.println("Enter Model Name");
            String model_name = sc.next();
            System.out.println("Enter the Year");
            int year_created = sc.nextInt();

           Cars2 motor = new Cars2(model_name,year_created);
            System.out.println(motor.model);
            System.out.println(motor.year);
        }
    }
}
