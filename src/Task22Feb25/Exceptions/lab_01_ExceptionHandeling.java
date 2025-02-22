package Task22Feb25.Exceptions;

public class lab_01_ExceptionHandeling {
    public static void main(String[] args) {
        String ip= args[0];
        int a = Integer.parseInt(ip);
        int b = 100/a;
        System.out.println(b);
        System.out.println("End of the Program");

        //java divid eby 0 - Value should be more than 0
        // java if input is not Integer - need to enter integer
        //java index out of bind - need to input value
    }
}
