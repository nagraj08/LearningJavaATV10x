package Java_Ex_05_IncrementDecreement;

public class lab_01_INcreementDecreement_01 {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]); // value is is assigend
        int b=++a; // value is increased before it is assigned
        System.out.println(b);
        System.out.println(a);
    }
}
