package Java_Ex_04_TernaryOperator;

public class Java_Ex_05_CLIOption {
    public static void main(String[] args) {

        String string_Age = args[0];
        int age =  Integer.parseInt(string_Age);
        System.out.println(age);
        // Adult, Minor, Senior
        //  Senior > 65,
        // Minor < 18
        // Adult > 18
        String result = age < 18 ?"Minor" : (age < 65)? "Adult":"Senior";
        System.out.println(result);
    }
}
