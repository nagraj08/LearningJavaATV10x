package Task22Feb25.Exceptions;

public class labt_20_Exceptions {
    public static void main(String[] args) {
        int a =0;
        int b = 10;
        int c = 0;
        try {
            c = b/a;
        } catch (ArithmeticException e) {
           // throw new RuntimeException(e);
            System.out.println("cannot / by zero");
        }
        // Unchecked - Arthmatice exception and Null pointer
        // java.lang.ArithmeticException exception for divide by zero in un handeled
        System.out.println(c);

        String name = null;
        try {
            name.trim();
        } catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println("Cannot invoke \"String.trim()\" because \"name\" is null");
        }

    }
}
