package Task02Feb25;

import java.util.Arrays;

public class lab_01_StringExcerises {
    public static void main(String[] args) {
        String str1 = "Hello";//Create or resue string in the SCP - string constant pool
        String str2 = "Hello";// reuse the "Hello" from the string constant pool
        String str3 = new String("Hello");//Create new string object  in the Heap memory

        System.out.println(str1 == str2);  // true, both refer to the same object in the pool
        System.out.println(str1 == str3);  // false, str3 is a new object in the heap
        System.out.println(str1.equals(str3));  // true, because the content is the same

        //Practice
        String name = "Nagraj";
        String name2 = "Nagraj Bitla";

        //charAt(0)
        System.out.println(name.charAt(0));
        // 2. concat()
        System.out.println(name2.concat(" Hello"));

        // 3. contains()
        System.out.println(name2.contains("Bitla"));

        // 4. equals()
        System.out.println(name.equals("nagraj"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("nagraj"));
        // 6. indexOf()
        System.out.println(name.indexOf('j'));
        // 7. length()
        System.out.println(name.length());
        // 8. replace( , )
        System.out.println(name.replace('a','@'));
        // 9. split()
        String str4 = "Nagraj Venkatesham";
        String str5 = str4.replaceAll("m","m Bitla");
        String [] split = str4.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10. substring( , )
        System.out.println(name.substring(1,3));

        // 11. toLowerCase()
        System.out.println(name.toLowerCase());
        // 12. toUpperCase()
        System.out.println(name.toUpperCase());
        // 13. replaceAll()
        System.out.println(str4.replaceAll("m","m Bitla"));
        // 14. startsWith()
        System.out.println(str4.startsWith("V"));
        // 15. endsWith()
        System.out.println(str4.replaceAll("m","m Bitla").endsWith("a"));
        // 16. isEmpty()
        System.out.println(str4.isEmpty() );
        // 17. trim()
        System.out.println(str5.trim());
        // 18. compareTo()
        System.out.println(name.compareTo("Nagraj"));
        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("nagraj"));
        System.out.println();
        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("a"));
        // 21. repeat()
        System.out.println(name.repeat(2));
        StringBuilder stringbuilder = new StringBuilder(name);
        System.out.println(stringbuilder.append(" Bitla"));
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println(sb.append(name2));
        String s1= "Hello";
        String s2 = " World!";
        String s3= s1+s2;
        System.out.println(s3);
        System.out.println(s1);

    }
}
