package Task22Feb25.Exceptions;

public class lab_6_Exception {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            int c = b/a;
            String s1= null;
            s1.trim();
        } catch (ArithmeticException  e) {
            //throw new RuntimeException(e);
             System.out.println(e.getMessage());
            }
        catch (NullPointerException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        }
    }

