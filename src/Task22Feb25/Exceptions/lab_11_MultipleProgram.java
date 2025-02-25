package Task22Feb25.Exceptions;

public class lab_11_MultipleProgram {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            b = 10/a;
            String s1= null;
            s1.trim();
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        System.out.println(b);

    }
}
