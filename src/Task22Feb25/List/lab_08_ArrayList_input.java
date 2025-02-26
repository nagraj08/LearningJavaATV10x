package Task22Feb25.List;

import javax.xml.transform.Source;
import java.util.*;

public class lab_08_ArrayList_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        String continueInput = "Y"; // Control variable for input loop
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter your name");
            String name = sc.nextLine();
            names.add(name);
            System.out.println("Enter your age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = sc.nextLine();
        }
        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }


        sc.close();
    }
}
