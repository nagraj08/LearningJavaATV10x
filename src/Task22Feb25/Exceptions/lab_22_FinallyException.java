package Task22Feb25.Exceptions;

public class lab_22_FinallyException {
    public static void main(String[] args) {
        try {
            int a =10/10;
            System.out.println(a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello Last");
        }

    }
}
