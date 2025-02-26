package Task22Feb25.MAP;
import java.util.*;
public class lab_06_Map_within_ArrayList {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap();
        student1.put("name", "Nagraj");
        student1.put("rollno", "1");
        student1.put("phone", "9833044137");

        HashMap<String, String> student2 = new HashMap();
        student2.put("name", "Rupesh");
        student2.put("rollno", "2");
        student2.put("phone", "9033040137");

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students.size());
        System.out.println(students);
//        for (int i = 0; i <=students.size(); i++) {
//            System.out.println(students.indexOf(i));
//        }
    }
}
