package Task22Feb25.Exceptions;

public class labt_20_Exceptions {
    public static void main(String[] args) {
        int a =0;
        int b = 10;
        int c = 0;
        try {
            c = b/a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
        // Unchecked - Arthmatice exception and Null pointer
        // java.lang.ArithmeticException exception for divide by zero in un handeled
        System.out.println(c);

        String name = null;
        name.trim();

    }
}
