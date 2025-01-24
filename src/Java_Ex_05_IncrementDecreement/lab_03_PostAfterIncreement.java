package Java_Ex_05_IncrementDecreement;

public class lab_03_PostAfterIncreement {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(++a);
        System.out.println(a);

        // POST increment = Print first then increase
        int a_post= Integer.parseInt(args[1]);
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
