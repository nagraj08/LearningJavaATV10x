package Task22Feb25.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class lab_04_Vector_List {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        v.add("Lucky");
        v.add(null);
        v.add(123);
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);
        System.out.println(" ---- ");
        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
        System.out.println("-------------------------");
        //Extra Enumeration
        Enumeration <String> enumeration = v.elements();
        while  (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());

        }
    }
}
