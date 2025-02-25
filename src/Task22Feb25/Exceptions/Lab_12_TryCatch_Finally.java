package Task22Feb25.Exceptions;

public class Lab_12_TryCatch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int b =0;
        try {
            b = a/0;
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be executed");
        }
        System.out.println(b);

    }
}
