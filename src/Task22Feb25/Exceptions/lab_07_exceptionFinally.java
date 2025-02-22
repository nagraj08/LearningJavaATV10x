package Task22Feb25.Exceptions;

public class lab_07_exceptionFinally {
    public static void main(String[] args) {

            int a = 1;
            int c = 0;
        try {
            c= 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
}
