package Task01Feb25;

public class lab_01_Strings {
    public static void main(String[] args) {
        String str1 = "Hello";//SCP - it i screte din string constant pool
        String str2 = "Hello";
        String str3 = new String("Hello");//create a new object on the heap memory allocation
        System.out.println(str1==str2);
        System.out.println(str3 ==str2);
        System.out.println(str1.equals(str3));
    }
}
