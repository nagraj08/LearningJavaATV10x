package Task22Feb25.Exceptions;

public class lab_05_Exception {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            int a = b/c;
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
