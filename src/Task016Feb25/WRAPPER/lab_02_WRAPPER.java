package Task016Feb25.WRAPPER;

public class lab_02_WRAPPER {
    public static void main(String[] args) {
        int a =10;
        Integer b = a; // Boxing int -> Integer  - JVM -> AutoBoxing
        //Autoboxing  -> a do att, be
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());
        Integer a2 = 42;
        int v= a2;//Unboxing
        System.out.println(v);
    }
}
