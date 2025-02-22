package Task22Feb25.Exceptions;

public class lab_4_Exception {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
