package Task22Feb25.MAP;

import java.util.*;

public class Lab_01_MAP_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m1.put("name","Nagraj");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
