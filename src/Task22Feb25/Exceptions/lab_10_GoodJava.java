package Task22Feb25.Exceptions;

public class lab_10_GoodJava {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10/a;
        } catch (ArithmeticException e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        System.out.println(b);
    }
}
