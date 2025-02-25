package Task22Feb25.Generics;

public class lab_02Generics {
    public static void main(String[] args) {
        temp(23, 45);
        temp("A", 1);
    }

    static <T> T temp(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        //System.out.println(a*b);
        return null;
    }
}
