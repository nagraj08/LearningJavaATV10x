package Task22Feb25.Exceptions;

public class lab_01_ExceptionHandeling {
    public static void main(String[] args) {

        System.out.println("Start Of the program");
        String ip= null;
        try {
            ip = args[0];
        } catch (ArithmeticException | NumberFormatException e) {
           // throw new RuntimeException(e);
            System.out.println(" Parameter should be Integer value more than 0");
        }

        int a = 0;
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
           // throw new RuntimeException(e);
            System.out.println(" Parameter should be Integer");
        }
        int b = 0;
        try {
            b = 100/a;
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(" Parameter should be Integer value more than 0");
        }
        System.out.println(b);
        System.out.println("End of the Program");

        //java divid eby 0 - Value should be more than 0
        // java if input is not Integer - need to enter integer
        //java index out of bind - need to input value
    }
}
